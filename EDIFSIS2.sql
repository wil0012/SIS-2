/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     02/06/2018 11:10:14 a.m.                     */
/*==============================================================*/


drop table if exists CARGO;

drop table if exists CLIENTE;

drop table if exists EDIFICIO;

drop table if exists EMPLEADO;

drop table if exists ESTACIONAMIENTO;

drop table if exists HABITACION;

drop table if exists LOGIN;

drop table if exists SERVICIO;

/*==============================================================*/
/* Table: CARGO                                                 */
/*==============================================================*/
create table CARGO
(
   ID_CARGO             int not null,
   ID_EMP               int,
   CARGO                char(30),
   SALARIO              decimal,
   HORA_INGRESO         datetime,
   HORA_SALIDA          datetime,
   TURNO                char(20),
   primary key (ID_CARGO)
);

/*==============================================================*/
/* Table: CLIENTE                                               */
/*==============================================================*/
create table CLIENTE
(
   ID_CLIENTE           int not null,
   ID_HABITACION        int,
   CI_CLIENTE           char(30),
   NOMBRE_CLIENTE       char(30),
   APELLIDO_CLIENTE     char(30),
   TELF_CLIENTE         int,
   ESTADO_CIVIL         char(20),
   TIPO_CLIENTE         char(20),
   DESCRIPCION_CLIENTE  char(50),
   primary key (ID_CLIENTE)
);

/*==============================================================*/
/* Table: EDIFICIO                                              */
/*==============================================================*/
create table EDIFICIO
(
   ID_EDIF              int not null,
   NOMBRE_EDIF          char(30),
   UBICACION            char(50),
   TELF_EDIF            int,
   CORREO_EDIF          char(50),
   primary key (ID_EDIF)
);

/*==============================================================*/
/* Table: EMPLEADO                                              */
/*==============================================================*/
create table EMPLEADO
(
   ID_EMP               int not null,
   ID_EDIF              int,
   ID_LOGIN             int,
   ID_CARGO             int,
   NOMBRE_EMP           char(30),
   APELLIDO_EMP         char(30),
   CI_EMP               varchar(30),
   TELF_EMP             int,
   FECHA_INGRESO        date,
   CORREO_EMP           char(30),
   primary key (ID_EMP)
);

/*==============================================================*/
/* Table: ESTACIONAMIENTO                                       */
/*==============================================================*/
create table ESTACIONAMIENTO
(
   ID_ESTACIONAMIENTO   int not null,
   ID_EDIF              int,
   NRO_LUGAR            smallint,
   ENTRADA              datetime,
   SALIDA               datetime,
   COSTO_ESTACIONAMIENTO decimal,
   primary key (ID_ESTACIONAMIENTO)
);

/*==============================================================*/
/* Table: HABITACION                                            */
/*==============================================================*/
create table HABITACION
(
   ID_HABITACION        int not null,
   ID_EDIF              int,
   NRO_HABITACION       char(10),
   PISO_HABITACION      smallint,
   EXTENSION_HABITACION smallint,
   COSTO_HABITACION     decimal,
   RESERVA              bool,
   CATEGORIA_HABITACION char(20),
   DESCRIP_HABITACION   char(50),
   ESTADIA_INICIO       date,
   ESTADIA_FIN          date,
   primary key (ID_HABITACION)
);

/*==============================================================*/
/* Table: LOGIN                                                 */
/*==============================================================*/
create table LOGIN
(
   ID_LOGIN             int not null,
   ID_EMP               int,
   NOMBRE_LOGIN         char(30),
   NICKNAME             char(30),
   PASSWORD             char(30),
   primary key (ID_LOGIN)
);

/*==============================================================*/
/* Table: SERVICIO                                              */
/*==============================================================*/
create table SERVICIO
(
   ID_SERVICIO          int not null,
   ID_EDIF              int,
   ID_CLIENTE           int,
   AGUA                 decimal,
   LUZ                  decimal,
   GAS                  decimal,
   MANTENIMENTO         decimal,
   TV_CABLE             decimal,
   EXTERNO              decimal,
   WIFFI                decimal,
   TELEFONO             decimal,
   primary key (ID_SERVICIO)
);

alter table CARGO add constraint FK_GERARQUIA2 foreign key (ID_EMP)
      references EMPLEADO (ID_EMP) on delete restrict on update restrict;

alter table CLIENTE add constraint FK_ALQUILA foreign key (ID_HABITACION)
      references HABITACION (ID_HABITACION) on delete restrict on update restrict;

alter table EMPLEADO add constraint FK_GERARQUIA foreign key (ID_CARGO)
      references CARGO (ID_CARGO) on delete restrict on update restrict;

alter table EMPLEADO add constraint FK_TIENE foreign key (ID_LOGIN)
      references LOGIN (ID_LOGIN) on delete restrict on update restrict;

alter table EMPLEADO add constraint FK_TRABAJA foreign key (ID_EDIF)
      references EDIFICIO (ID_EDIF) on delete restrict on update restrict;

alter table ESTACIONAMIENTO add constraint FK_SECTOR foreign key (ID_EDIF)
      references EDIFICIO (ID_EDIF) on delete restrict on update restrict;

alter table HABITACION add constraint FK_PISOS foreign key (ID_EDIF)
      references EDIFICIO (ID_EDIF) on delete restrict on update restrict;

alter table LOGIN add constraint FK_TIENE2 foreign key (ID_EMP)
      references EMPLEADO (ID_EMP) on delete restrict on update restrict;

alter table SERVICIO add constraint FK_GASTO foreign key (ID_EDIF)
      references EDIFICIO (ID_EDIF) on delete restrict on update restrict;

alter table SERVICIO add constraint FK_OBLIGADO foreign key (ID_CLIENTE)
      references CLIENTE (ID_CLIENTE) on delete restrict on update restrict;

