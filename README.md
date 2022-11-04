# prenotazionevaccini

Progetto Ingegneria del software 2020/2021

Consegna progetto:

Si vuole progettare un sistema informatico per gestire il servizio di prenotazione per le campagne vaccinali di una Azienda Sanitaria Locale (ASL).
Il sistema di prenotazione è gestito dal personale dell’ASL, che può inserire la campagna vaccinale di volta in volta considerata (influenza, Covid-19, SarS, e così via). Il personale attiva di volta in volta le disponibilità per la somministrazione del vaccino, indicando lo specifico vaccino, i giorni, orari, e ambulatori disponibili per categorie di cittadini e per campagna vaccinale. Le disponibilità sono indicate rispetto alle scorte dei vaccini per le varie campagne.
I cittadini che aderiscono ad una certa campagna vaccinale possono accedere al sistema di prenotazione dopo essersi registrati. In fase di registrazione, essi devono indicare nome, cognome, codice fiscale, e saranno informati della specifica categoria di appartenenza (“over 80”, “età 70-79”, “paziente oncologico”, “paziente iperteso”, “paziente a rischio”, e così via), di cui il sistema è a conoscenza. Se il cittadino non rientra nell’anagrafica a disposizione del sistema, il sistema stesso provvederà a indicare tale anomalia al cittadino e ad indicare l’email a cui far pervenire eventuali domande di chiarimento.
Una volta registrati, i cittadini accedono al sistema e trovano le campagne vaccinali a cui possono aderire. Per ogni campagna il cittadino può vedere gli orari e le sedi disponibili giorno per giorno e selezionare il momento desiderato presso l’ambulatorio che desidera. Il sistema permette ovviamente più prenotazioni e registrazioni contemporaneamente da differenti cittadini.
Il sistema mostra al cittadino anche la finestra temporale nella quale sono state identificate le disponibilità rispetto alle scorte, ed evidenzia opportunamente i periodi per i quali non sono ancora state inserite le disponibilità da parte dell’ASL. In questo modo il cittadino è in grado di distinguere slot occupati, slot liberi e slot non ancora gestiti. Il sistema avvisa il cittadino, che ne abbia fatto richiesta attraverso il sistema, rispetto al momento in cui un certo periodo di tempo sarà disponibile per le prenotazioni di una data campagna vaccinale.
Il personale ASL associa ad ogni campagna vaccinale le categorie di cittadini che hanno diritto alle vaccinazioni con uno specifico vaccino.
Il sistema memorizza i dati demografici essenziali per ogni cittadino: codice fiscale, numero di tessera sanitaria, cognome, nome, luogo e data di nascita, specifiche categorie appartenenza (paziente oncologico, paziente iperteso, paziente a rischio, e così via), e verifica che i dati delle registrazioni dei singoli cittadini siano corrette rispetto all’anagrafica a disposizione.

Matteo Esposito Marroccella e Nicola Speri
