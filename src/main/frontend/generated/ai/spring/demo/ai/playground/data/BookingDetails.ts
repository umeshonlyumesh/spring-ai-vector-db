import type BookingStatus_1 from "./BookingStatus.js";
interface BookingDetails {
    bookingNumber: string;
    firstName: string;
    lastName: string;
    date: string;
    bookingStatus: BookingStatus_1;
    from: string;
    to: string;
    bookingClass: string;
}
export default BookingDetails;
