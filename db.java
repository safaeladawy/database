alter table patient add doctorID number references doctor(phys_ID)

alter table doctor add patientID number references patient(PID) unique

create table pharmacy ( phar_ID int primary key, name varchar(32) not null, fax varchar(32), address varchar(32) not null)

create table employ ( empname varchar(32) not null, EmployeeID int primary key, pharID int,                     
                    foreign key (pharID) references Pharmacy(Phar_ID))

create table patient ( PID int primary key, name varchar(32) not null, sex varchar(7) not null, address varchar(32) not null, contact_no int not 
                       null, Insurance_Info varchar(32), phyID int, 
                       foreign key (phyID) references Doctor(Phys_ID) )

create table Drug (tradeName varchar(32) primary key, CID number,
                   foreign key (CID) references Drug_Manufacturer(Company_ID))

alter table Drug_Macufacturer add foreign key (pharID) references Pharmacy(Phar_ID)***

create table sell (price number,
                   pharID int, tradeName varchar(32),
                   primary key (pharID, tradeName),
                   foreign key (pharID) references Pharmacy(Phar_ID),
                   foreign key (tradeName) references Drug(tradeName))

create table prescribe ( Date date, quantity int,
                         pk unique, pk2 unique, pk3 unique,
                         primary key(pk, pk2, pk3),
                         foreign key (pk) references Patient(PID),
                         foreign key (pk2) references Drug(tradeName),
                         foreign key (pk3) references Doctor(Phys_ID)
                        )


insert into patient values (1234, 'Ali', 'male', 'louranAlex', 0122222222, 'healthInsurance')

insert into patient values( 8934, 'Alyaa', 'female', 'Alex', 0123456722, 'healthInsurance')

insert into patient values( 1269, 'Hassan', 'male', 'cairo', 0129876242,'healthInsuranse')

insert into patient values( 9876, 'Hoda', 'female', 'vectoriaAlex', 01255555672,'healthInsurance')


insert into doctor values(567634, 'Khaled', 'surgry')

insert into doctor values(123664, 'Abdelrahman', 'dermatologist')

insert into doctor values(464663, 'Adel', 'orthopedist')

insert into doctor values(875309, 'Ali', 'genocologist')


insert into Drug_Manufacturer values('mebaco', 98765, 'cairoEgypt')

insert into Drug_Manufacturer values('sigma', 92345, 'AlexEgypt')

insert into Drug_Manufacturer values('chatomaps', 23789, 'England')

insert into Drug_Manufacturer values('chatomaps', 23789, 'England')


insert into pharmacy values(98653, 'farmastore','678ngh88', 'vectoria')

insert into pharmacy values(97378, 'medicinestore','987bfjtf42', 'Louran')

insert into pharmacy values(83567, 'faraology','987ojhf87', 'cairo')

insert into pharmacy values(340860, 'khalil','987ojklog', 'cairo')

insert into Drug values('Catafly')

insert into Drug values('Dinitra')

insert into Drug values('Napibradine')

insert into Drug values('Ferrotron')

insert into Drug values('Depaglif')

insert into Drug values('Vastarel')

insert into Drug values('Brilique')

insert into Drug values('Liposon-D3')

insert into Drug values('crestor')


insert into employee values('Alaa', 89000)

insert into employee values('Mohsen', 789521)

insert into employee values('salah', 999837)

insert into employee values('salem', 567742)