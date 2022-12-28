package com.fletx.pruebA.data.model

data class Vehicle(
    val back_ownership_card: BackOwnershipCard,
    val carcolor: Carcolor,
    val carconfig: Carconfig,
    val carline: Carline,
    val carmark: Carmark,
    val cartype: Cartype,
    val created_at: String,
    val driver: Driver,
    val empty_weight: Int,
    val front_ownership_card: FrontOwnershipCard,
    val front_vehicle: FrontVehicle,
    val fuel: Fuel,
    val has_gps_fletx: Boolean,
    val holder: Holder,
    val id: Int,
    val insurance_poliy: InsurancePoliy,
    val is_own_treatment: Boolean,
    val is_owner: Boolean,
    val load_capacity: Int,
    val lonlat: String,
    val maximum_weight: Int,
    val model: Int,
    val owner: Owner,
    val password: String,
    val photo_tecnomecanica: PhotoTecnomecanica,
    val picture_panoramic_vehicle: PicturePanoramicVehicle,
    val placa: String,
    val profile: Profile,
    val rear_vehicle: RearVehicle,
    val repowering: Int,
    val satellite_provider: Any,
    val satellite_provider_id: Any,
    val soat_photo: SoatPhoto,
    val status: Int,
    val thirdstate: Thirdstate,
    val thirdstate_id: Int,
    val trailer: Trailer,
    val updated_at: String,
    val url: String,
    val username: String,
    val vehicle_workshop: VehicleWorkshop
)

data class BackOwnershipCard(
    val url: String
)

data class Carcolor(
    val created_at: String,
    val id: Int,
    val name: String,
    val partner_id: Int,
    val status: Int,
    val updated_at: String,
    val value: Any
)

data class Carconfig(
    val apply_cartype: Boolean,
    val capacity: Int,
    val code: String,
    val countries_id: Int,
    val created_at: String,
    val description: String,
    val equivalent: List<Int>,
    val fletxptos_kms: List<Any>,
    val id: Int,
    val image: Image,
    val minimum_weight: Int,
    val order: Int,
    val status: Int,
    val updated_at: String,
    val volume_gl: Int,
    val volume_mt: Int
)

data class Carline(
    val carmarks_id: Int,
    val created_at: String,
    val id: Int,
    val name: String,
    val partner_id: Int,
    val status: Int,
    val updated_at: String,
    val value: String
)

data class Carmark(
    val code_mint: Int,
    val created_at: String,
    val id: Int,
    val name: String,
    val partner_id: Int,
    val status: Int,
    val updated_at: String
)

data class Cartype(
    val code_mint: Int,
    val created_at: String,
    val equivalent: List<Int>,
    val id: Int,
    val kind: String,
    val name: String,
    val partner_id: Int,
    val status: Int,
    val updated_at: String
)

data class Driver(
    val full_name: String,
    val id: Int,
    val thirdstates_id: Int
)

data class FrontOwnershipCard(
    val url: String
)

data class FrontVehicle(
    val url: String
)

data class Fuel(
    val created_at: String,
    val id: Int,
    val name: String,
    val status: Int,
    val updated_at: String,
    val value: String
)

data class Holder(
    val full_name: String,
    val id: Int,
    val thirdstates_id: Int
)

data class InsurancePoliy(
    val url: String
)

data class Owner(
    val full_name: String,
    val id: Int,
    val thirdstates_id: Int
)

data class PhotoTecnomecanica(
    val url: String
)

data class PicturePanoramicVehicle(
    val url: String
)

data class Profile(
    val config: Config,
    val expired_documents: List<Any>,
    val soat: Soat,
    val tecnomecanica: Tecnomecanica
)

data class RearVehicle(
    val url: String
)

data class SoatPhoto(
    val url: String
)

data class Thirdstate(
    val created_at: String,
    val id: Int,
    val name: String,
    val status: String,
    val updated_at: String
)

data class Trailer(
    val back_card: BackCard,
    val carcolor_id: Int,
    val cartype: Cartype,
    val cartype_id: Int,
    val empty_weight: String,
    val front_card: FrontCard,
    val holder_id: Int,
    val id: Int,
    val maximum_weight: Int,
    val model: Int,
    val num_axes: String,
    val owner_id: Int,
    val picture: Picture,
    val placa: String,
    val trailermark: Trailermark,
    val trailermark_id: Int,
    val vehicle_id: Int
)

data class VehicleWorkshop(
    val created_at: String,
    val engine: String,
    val gearbox: String,
    val id: Int,
    val tires: String,
    val transmission: String,
    val updated_at: String,
    val vehicle_id: Int
)

data class Image(
    val url: String
)

data class Config(
    val chassis_number: String,
    val engine_number: String
)

data class Soat(
    val date_expired: String,
    val ensure_id: String,
    val number: String
)

data class Tecnomecanica(
    val date_expired: String,
    val number: String
)

data class BackCard(
    val url: String
)

data class FrontCard(
    val url: String
)

data class Picture(
    val url: String
)

data class Trailermark(
    val code_mint: Int,
    val created_at: String,
    val id: Int,
    val name: String,
    val partner_id: Int,
    val status: Int,
    val updated_at: String
)