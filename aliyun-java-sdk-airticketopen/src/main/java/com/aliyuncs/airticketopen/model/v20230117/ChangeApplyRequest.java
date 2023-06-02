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
public class ChangeApplyRequest extends RoaAcsRequest<ChangeApplyResponse> {
	   

	@SerializedName("change_passenger_list")
	private List<Change_passenger_list> change_passenger_list;

	private String biz_language;

	private String biz_currency;

	@SerializedName("changed_journeys")
	private List<Changed_journeys> changed_journeys;

	private String biz_session_nick;

	private String remark;

	private Integer type;

	private Long biz_havana_id;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	@SerializedName("contact")
	private Contact contact;

	private Long biz_session_uid;

	private Long order_num;

	private String xacsairticketlanguage;

	private String biz_app_key;
	public ChangeApplyRequest() {
		super("airticketOpen", "2023-01-17", "ChangeApply");
		setUriPattern("/airticket/v1/change/action-apply");
		setMethod(MethodType.POST);
	}

	public List<Change_passenger_list> getChange_passenger_list() {
		return this.change_passenger_list;
	}

	public void setChange_passenger_list(List<Change_passenger_list> change_passenger_list) {
		this.change_passenger_list = change_passenger_list;	
		if (change_passenger_list != null) {
			putBodyParameter("change_passenger_list" , new Gson().toJson(change_passenger_list));
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

	public List<Changed_journeys> getChanged_journeys() {
		return this.changed_journeys;
	}

	public void setChanged_journeys(List<Changed_journeys> changed_journeys) {
		this.changed_journeys = changed_journeys;	
		if (changed_journeys != null) {
			putBodyParameter("changed_journeys" , new Gson().toJson(changed_journeys));
		}	
	}

	public String getBiz_session_nick() {
		return this.biz_session_nick;
	}

	public void setBiz_session_nick(String biz_session_nick) {
		this.biz_session_nick = biz_session_nick;
		}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
		if(remark != null){
			putBodyParameter("remark", remark);
		}
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		if(type != null){
			putBodyParameter("type", type.toString());
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

	public Contact getContact() {
		return this.contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;	
		if (contact != null) {
			putBodyParameter("contact" , new Gson().toJson(contact));
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

	public static class Change_passenger_list {

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

	public static class Changed_journeys {

		@SerializedName("segment_list")
		private List<Segment_listItem> segment_list;

		public List<Segment_listItem> getSegment_list() {
			return this.segment_list;
		}

		public void setSegment_list(List<Segment_listItem> segment_list) {
			this.segment_list = segment_list;
		}

		public static class Segment_listItem {

			@SerializedName("departure_terminal")
			private String departure_terminal;

			@SerializedName("code_share")
			private Boolean code_share;

			@SerializedName("departure_airport")
			private String departure_airport;

			@SerializedName("departure_date")
			private String departure_date;

			@SerializedName("arrival_airport")
			private String arrival_airport;

			@SerializedName("arrival_city")
			private String arrival_city;

			@SerializedName("arrive_terminal")
			private String arrive_terminal;

			@SerializedName("operating_flight_no")
			private String operating_flight_no;

			@SerializedName("departure_city")
			private String departure_city;

			@SerializedName("marketing_flight_no")
			private String marketing_flight_no;

			@SerializedName("departure_time")
			private Long departure_time;

			@SerializedName("arrive_time")
			private Long arrive_time;

			public String getDeparture_terminal() {
				return this.departure_terminal;
			}

			public void setDeparture_terminal(String departure_terminal) {
				this.departure_terminal = departure_terminal;
			}

			public Boolean getCode_share() {
				return this.code_share;
			}

			public void setCode_share(Boolean code_share) {
				this.code_share = code_share;
			}

			public String getDeparture_airport() {
				return this.departure_airport;
			}

			public void setDeparture_airport(String departure_airport) {
				this.departure_airport = departure_airport;
			}

			public String getDeparture_date() {
				return this.departure_date;
			}

			public void setDeparture_date(String departure_date) {
				this.departure_date = departure_date;
			}

			public String getArrival_airport() {
				return this.arrival_airport;
			}

			public void setArrival_airport(String arrival_airport) {
				this.arrival_airport = arrival_airport;
			}

			public String getArrival_city() {
				return this.arrival_city;
			}

			public void setArrival_city(String arrival_city) {
				this.arrival_city = arrival_city;
			}

			public String getArrive_terminal() {
				return this.arrive_terminal;
			}

			public void setArrive_terminal(String arrive_terminal) {
				this.arrive_terminal = arrive_terminal;
			}

			public String getOperating_flight_no() {
				return this.operating_flight_no;
			}

			public void setOperating_flight_no(String operating_flight_no) {
				this.operating_flight_no = operating_flight_no;
			}

			public String getDeparture_city() {
				return this.departure_city;
			}

			public void setDeparture_city(String departure_city) {
				this.departure_city = departure_city;
			}

			public String getMarketing_flight_no() {
				return this.marketing_flight_no;
			}

			public void setMarketing_flight_no(String marketing_flight_no) {
				this.marketing_flight_no = marketing_flight_no;
			}

			public Long getDeparture_time() {
				return this.departure_time;
			}

			public void setDeparture_time(Long departure_time) {
				this.departure_time = departure_time;
			}

			public Long getArrive_time() {
				return this.arrive_time;
			}

			public void setArrive_time(Long arrive_time) {
				this.arrive_time = arrive_time;
			}
		}
	}

	public static class Contact {

		@SerializedName("mobile_phone_num")
		private String mobile_phone_num;

		@SerializedName("mobile_country_code")
		private String mobile_country_code;

		@SerializedName("email")
		private String email;

		public String getMobile_phone_num() {
			return this.mobile_phone_num;
		}

		public void setMobile_phone_num(String mobile_phone_num) {
			this.mobile_phone_num = mobile_phone_num;
		}

		public String getMobile_country_code() {
			return this.mobile_country_code;
		}

		public void setMobile_country_code(String mobile_country_code) {
			this.mobile_country_code = mobile_country_code;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	@Override
	public Class<ChangeApplyResponse> getResponseClass() {
		return ChangeApplyResponse.class;
	}

}
