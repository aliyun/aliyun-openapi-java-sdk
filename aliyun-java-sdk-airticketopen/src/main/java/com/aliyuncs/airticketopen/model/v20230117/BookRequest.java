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
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class BookRequest extends RoaAcsRequest<BookResponse> {
	   

	private String biz_language;

	private String biz_currency;

	private String biz_session_nick;

	private String solution_id;

	@SerializedName("passenger_ancillary_purchase_map_list")
	private List<Passenger_ancillary_purchase_map_list> passenger_ancillary_purchase_map_list;

	private String out_order_num;

	private Long biz_havana_id;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	@SerializedName("contact")
	private Contact contact;

	private Long biz_session_uid;

	private String xacsairticketlanguage;

	private String biz_app_key;

	@SerializedName("passenger_list")
	private List<Passenger_list> passenger_list;
	public BookRequest() {
		super("airticketOpen", "2023-01-17", "Book");
		setUriPattern("/airticket/v1/trade/action-book");
		setMethod(MethodType.POST);
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

	public String getBiz_session_nick() {
		return this.biz_session_nick;
	}

	public void setBiz_session_nick(String biz_session_nick) {
		this.biz_session_nick = biz_session_nick;
		}

	public String getSolution_id() {
		return this.solution_id;
	}

	public void setSolution_id(String solution_id) {
		this.solution_id = solution_id;
		if(solution_id != null){
			putBodyParameter("solution_id", solution_id);
		}
	}

	public List<Passenger_ancillary_purchase_map_list> getPassenger_ancillary_purchase_map_list() {
		return this.passenger_ancillary_purchase_map_list;
	}

	public void setPassenger_ancillary_purchase_map_list(List<Passenger_ancillary_purchase_map_list> passenger_ancillary_purchase_map_list) {
		this.passenger_ancillary_purchase_map_list = passenger_ancillary_purchase_map_list;	
		if (passenger_ancillary_purchase_map_list != null) {
			putBodyParameter("passenger_ancillary_purchase_map_list" , new Gson().toJson(passenger_ancillary_purchase_map_list));
		}	
	}

	public String getOut_order_num() {
		return this.out_order_num;
	}

	public void setOut_order_num(String out_order_num) {
		this.out_order_num = out_order_num;
		if(out_order_num != null){
			putBodyParameter("out_order_num", out_order_num);
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

	public List<Passenger_list> getPassenger_list() {
		return this.passenger_list;
	}

	public void setPassenger_list(List<Passenger_list> passenger_list) {
		this.passenger_list = passenger_list;	
		if (passenger_list != null) {
			putBodyParameter("passenger_list" , new Gson().toJson(passenger_list));
		}	
	}

	public static class Passenger_ancillary_purchase_map_list {

		@SerializedName("ancillary_list")
		private List<Ancillary_listItem> ancillary_list;

		@SerializedName("passenger_list")
		private List<Passenger_listItem> passenger_list;

		public List<Ancillary_listItem> getAncillary_list() {
			return this.ancillary_list;
		}

		public void setAncillary_list(List<Ancillary_listItem> ancillary_list) {
			this.ancillary_list = ancillary_list;
		}

		public List<Passenger_listItem> getPassenger_list() {
			return this.passenger_list;
		}

		public void setPassenger_list(List<Passenger_listItem> passenger_list) {
			this.passenger_list = passenger_list;
		}

		public static class Ancillary_listItem {

			@SerializedName("ancillary_type")
			private Integer ancillary_type;

			@SerializedName("ancillary_id")
			private String ancillary_id;

			@SerializedName("ancillary_info")
			private Map<String,String> ancillary_info;

			public Integer getAncillary_type() {
				return this.ancillary_type;
			}

			public void setAncillary_type(Integer ancillary_type) {
				this.ancillary_type = ancillary_type;
			}

			public String getAncillary_id() {
				return this.ancillary_id;
			}

			public void setAncillary_id(String ancillary_id) {
				this.ancillary_id = ancillary_id;
			}

			public Map<String,String> getAncillary_info() {
				return this.ancillary_info;
			}

			public void setAncillary_info(Map<String,String> ancillary_info) {
				this.ancillary_info = ancillary_info;
			}
		}

		public static class Passenger_listItem {

			@SerializedName("birthday")
			private String birthday;

			@SerializedName("gender")
			private Integer gender;

			@SerializedName("nationality")
			private String nationality;

			@SerializedName("credential")
			private Credential credential;

			@SerializedName("last_name")
			private String last_name;

			@SerializedName("type")
			private Integer type;

			@SerializedName("mobile_country_code")
			private String mobile_country_code;

			@SerializedName("first_name")
			private String first_name;

			@SerializedName("mobile_phone_number")
			private String mobile_phone_number;

			public String getBirthday() {
				return this.birthday;
			}

			public void setBirthday(String birthday) {
				this.birthday = birthday;
			}

			public Integer getGender() {
				return this.gender;
			}

			public void setGender(Integer gender) {
				this.gender = gender;
			}

			public String getNationality() {
				return this.nationality;
			}

			public void setNationality(String nationality) {
				this.nationality = nationality;
			}

			public Credential getCredential() {
				return this.credential;
			}

			public void setCredential(Credential credential) {
				this.credential = credential;
			}

			public String getLast_name() {
				return this.last_name;
			}

			public void setLast_name(String last_name) {
				this.last_name = last_name;
			}

			public Integer getType() {
				return this.type;
			}

			public void setType(Integer type) {
				this.type = type;
			}

			public String getMobile_country_code() {
				return this.mobile_country_code;
			}

			public void setMobile_country_code(String mobile_country_code) {
				this.mobile_country_code = mobile_country_code;
			}

			public String getFirst_name() {
				return this.first_name;
			}

			public void setFirst_name(String first_name) {
				this.first_name = first_name;
			}

			public String getMobile_phone_number() {
				return this.mobile_phone_number;
			}

			public void setMobile_phone_number(String mobile_phone_number) {
				this.mobile_phone_number = mobile_phone_number;
			}

			public static class Credential {

				@SerializedName("credential_type")
				private Integer credential_type;

				@SerializedName("expire_date")
				private String expire_date;

				@SerializedName("credential_num")
				private String credential_num;

				@SerializedName("cert_issue_place")
				private String cert_issue_place;

				public Integer getCredential_type() {
					return this.credential_type;
				}

				public void setCredential_type(Integer credential_type) {
					this.credential_type = credential_type;
				}

				public String getExpire_date() {
					return this.expire_date;
				}

				public void setExpire_date(String expire_date) {
					this.expire_date = expire_date;
				}

				public String getCredential_num() {
					return this.credential_num;
				}

				public void setCredential_num(String credential_num) {
					this.credential_num = credential_num;
				}

				public String getCert_issue_place() {
					return this.cert_issue_place;
				}

				public void setCert_issue_place(String cert_issue_place) {
					this.cert_issue_place = cert_issue_place;
				}
			}
		}
	}

	public static class Contact {

		@SerializedName("mobile_phone_num")
		private String mobile_phone_num;

		@SerializedName("last_name")
		private String last_name;

		@SerializedName("mobile_country_code")
		private String mobile_country_code;

		@SerializedName("first_name")
		private String first_name;

		@SerializedName("email")
		private String email;

		public String getMobile_phone_num() {
			return this.mobile_phone_num;
		}

		public void setMobile_phone_num(String mobile_phone_num) {
			this.mobile_phone_num = mobile_phone_num;
		}

		public String getLast_name() {
			return this.last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public String getMobile_country_code() {
			return this.mobile_country_code;
		}

		public void setMobile_country_code(String mobile_country_code) {
			this.mobile_country_code = mobile_country_code;
		}

		public String getFirst_name() {
			return this.first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getEmail() {
			return this.email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
	}

	public static class Passenger_list {

		@SerializedName("birthday")
		private String birthday;

		@SerializedName("gender")
		private Integer gender;

		@SerializedName("nationality")
		private String nationality;

		@SerializedName("credential")
		private Credential credential;

		@SerializedName("last_name")
		private String last_name;

		@SerializedName("type")
		private Integer type;

		@SerializedName("mobile_country_code")
		private String mobile_country_code;

		@SerializedName("first_name")
		private String first_name;

		@SerializedName("mobile_phone_number")
		private String mobile_phone_number;

		public String getBirthday() {
			return this.birthday;
		}

		public void setBirthday(String birthday) {
			this.birthday = birthday;
		}

		public Integer getGender() {
			return this.gender;
		}

		public void setGender(Integer gender) {
			this.gender = gender;
		}

		public String getNationality() {
			return this.nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public Credential getCredential() {
			return this.credential;
		}

		public void setCredential(Credential credential) {
			this.credential = credential;
		}

		public String getLast_name() {
			return this.last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public Integer getType() {
			return this.type;
		}

		public void setType(Integer type) {
			this.type = type;
		}

		public String getMobile_country_code() {
			return this.mobile_country_code;
		}

		public void setMobile_country_code(String mobile_country_code) {
			this.mobile_country_code = mobile_country_code;
		}

		public String getFirst_name() {
			return this.first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getMobile_phone_number() {
			return this.mobile_phone_number;
		}

		public void setMobile_phone_number(String mobile_phone_number) {
			this.mobile_phone_number = mobile_phone_number;
		}

		public static class Credential {

			@SerializedName("credential_type")
			private Integer credential_type;

			@SerializedName("expire_date")
			private String expire_date;

			@SerializedName("credential_num")
			private String credential_num;

			@SerializedName("cert_issue_place")
			private String cert_issue_place;

			public Integer getCredential_type() {
				return this.credential_type;
			}

			public void setCredential_type(Integer credential_type) {
				this.credential_type = credential_type;
			}

			public String getExpire_date() {
				return this.expire_date;
			}

			public void setExpire_date(String expire_date) {
				this.expire_date = expire_date;
			}

			public String getCredential_num() {
				return this.credential_num;
			}

			public void setCredential_num(String credential_num) {
				this.credential_num = credential_num;
			}

			public String getCert_issue_place() {
				return this.cert_issue_place;
			}

			public void setCert_issue_place(String cert_issue_place) {
				this.cert_issue_place = cert_issue_place;
			}
		}
	}

	@Override
	public Class<BookResponse> getResponseClass() {
		return BookResponse.class;
	}

}
