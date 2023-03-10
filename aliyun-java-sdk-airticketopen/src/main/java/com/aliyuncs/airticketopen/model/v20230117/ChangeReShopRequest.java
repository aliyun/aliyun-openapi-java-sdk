/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.airticketopen.model.v20230117;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeReShopRequest extends RoaAcsRequest<ChangeReShopResponse> {
	   

	private Integer reason;

	private String biz_language;

	private String biz_currency;

	@SerializedName("passengers")
	private List<Passengers> passengers;

	private String biz_session_nick;

	@SerializedName("air_legs")
	private List<Air_legs> air_legs;

	private Integer trip_type;

	private Long biz_havana_id;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	private Long biz_session_uid;

	private Long order_num;

	private String xacsairticketlanguage;

	private String biz_app_key;
	public ChangeReShopRequest() {
		super("airticketOpen", "2023-01-17", "ChangeReShop");
		setUriPattern("/airticket/v1/change/action-reshop");
		setMethod(MethodType.POST);
	}

	public Integer getReason() {
		return this.reason;
	}

	public void setReason(Integer reason) {
		this.reason = reason;
		if(reason != null){
			putBodyParameter("reason", reason.toString());
		}
	}

	public String getBiz_language() {
		return this.biz_language;
	}

	public void setBiz_language(String biz_language) {
		this.biz_language = biz_language;
		}

	public String getBiz_currency() {
		return this.biz_currency;
	}

	public void setBiz_currency(String biz_currency) {
		this.biz_currency = biz_currency;
		}

	public List<Passengers> getPassengers() {
		return this.passengers;
	}

	public void setPassengers(List<Passengers> passengers) {
		this.passengers = passengers;	
		if (passengers != null) {
			putBodyParameter("passengers" , new Gson().toJson(passengers));
		}	
	}

	public String getBiz_session_nick() {
		return this.biz_session_nick;
	}

	public void setBiz_session_nick(String biz_session_nick) {
		this.biz_session_nick = biz_session_nick;
		}

	public List<Air_legs> getAir_legs() {
		return this.air_legs;
	}

	public void setAir_legs(List<Air_legs> air_legs) {
		this.air_legs = air_legs;	
		if (air_legs != null) {
			putBodyParameter("air_legs" , new Gson().toJson(air_legs));
		}	
	}

	public Integer getTrip_type() {
		return this.trip_type;
	}

	public void setTrip_type(Integer trip_type) {
		this.trip_type = trip_type;
		if(trip_type != null){
			putBodyParameter("trip_type", trip_type.toString());
		}
	}

	public Long getBiz_havana_id() {
		return this.biz_havana_id;
	}

	public void setBiz_havana_id(Long biz_havana_id) {
		this.biz_havana_id = biz_havana_id;
		}

	public String getBiz_zone_id() {
		return this.biz_zone_id;
	}

	public void setBiz_zone_id(String biz_zone_id) {
		this.biz_zone_id = biz_zone_id;
		}

	public String getXacsairticketaccesstoken() {
		return this.xacsairticketaccesstoken;
	}

	public void setXacsairticketaccesstoken(String xacsairticketaccesstoken) {
		this.xacsairticketaccesstoken = xacsairticketaccesstoken;
		if(xacsairticketaccesstoken != null){
			putHeaderParameter("x-acs-airticket-access-token", xacsairticketaccesstoken);
		}
	}

	public Long getBiz_session_uid() {
		return this.biz_session_uid;
	}

	public void setBiz_session_uid(Long biz_session_uid) {
		this.biz_session_uid = biz_session_uid;
		}

	public Long getOrder_num() {
		return this.order_num;
	}

	public void setOrder_num(Long order_num) {
		this.order_num = order_num;
		if(order_num != null){
			putBodyParameter("order_num", order_num.toString());
		}
	}

	public String getXacsairticketlanguage() {
		return this.xacsairticketlanguage;
	}

	public void setXacsairticketlanguage(String xacsairticketlanguage) {
		this.xacsairticketlanguage = xacsairticketlanguage;
		if(xacsairticketlanguage != null){
			putHeaderParameter("x-acs-airticket-language", xacsairticketlanguage);
		}
	}

	public String getBiz_app_key() {
		return this.biz_app_key;
	}

	public void setBiz_app_key(String biz_app_key) {
		this.biz_app_key = biz_app_key;
		}

	public static class Passengers {

		@SerializedName("document")
		private String document;

		@SerializedName("last_name")
		private String last_name;

		@SerializedName("first_name")
		private String first_name;

		public String getDocument() {
			return this.document;
		}

		public void setDocument(String document) {
			this.document = document;
		}

		public String getLast_name() {
			return this.last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getFirst_name() {
			return this.first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}
	}

	public static class Air_legs {

		@SerializedName("departure_airport_list")
		private List<String> departure_airport_list;

		@SerializedName("arrival_airport_list")
		private List<String> arrival_airport_list;

		@SerializedName("departure_date")
		private String departure_date;

		@SerializedName("arrival_city")
		private String arrival_city;

		@SerializedName("departure_city")
		private String departure_city;

		public List<String> getDeparture_airport_list() {
			return this.departure_airport_list;
		}

		public void setDeparture_airport_list(List<String> departure_airport_list) {
			this.departure_airport_list = departure_airport_list;
		}

		public List<String> getArrival_airport_list() {
			return this.arrival_airport_list;
		}

		public void setArrival_airport_list(List<String> arrival_airport_list) {
			this.arrival_airport_list = arrival_airport_list;
		}

		public String getDeparture_date() {
			return this.departure_date;
		}

		public void setDeparture_date(String departure_date) {
			this.departure_date = departure_date;
		}

		public String getArrival_city() {
			return this.arrival_city;
		}

		public void setArrival_city(String arrival_city) {
			this.arrival_city = arrival_city;
		}

		public String getDeparture_city() {
			return this.departure_city;
		}

		public void setDeparture_city(String departure_city) {
			this.departure_city = departure_city;
		}
	}

	@Override
	public Class<ChangeReShopResponse> getResponseClass() {
		return ChangeReShopResponse.class;
	}

}
