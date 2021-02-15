import { Destination } from "./destination";

export class FlightRequest {

    applicantName: string;
    travelDate: Date;
    destination: Destination;
    requestDate: Date;
    status: string;
}
