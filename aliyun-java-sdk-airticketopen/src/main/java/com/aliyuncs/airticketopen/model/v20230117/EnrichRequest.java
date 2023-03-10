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
public class EnrichRequest extends RoaAcsRequest<EnrichResponse> {
	   

	private String cabin_class;

	private String biz_language;

	private String biz_currency;

	private Integer infants;

	private String biz_session_nick;

	private Integer adults;

	private String solution_id;

	@SerializedName("journey_param_list")
	private List<Journey_param_list> journey_param_list;

	private Long biz_havana_id;

	private Integer children;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	private Long biz_session_uid;

	private String xacsairticketlanguage;

	private String biz_app_key;
	public EnrichRequest() {
		super("airticketOpen", "2023-01-17", "Enrich");
		setUriPattern("/airticket/v1/trade/action-enrich");
		setMethod(MethodType.POST);
	}

	public String getCabin_class() {
		return this.cabin_class;
	}

	public void setCabin_class(String cabin_class) {
		this.cabin_class = cabin_class;
		if(cabin_class != null){
			putBodyParameter("cabin_class", cabin_class);
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

	public Integer getInfants() {
		return this.infants;
	}

	public void setInfants(Integer infants) {
		this.infants = infants;
		if(infants != null){
			putBodyParameter("infants", infants.toString());
		}
	}

	public String getBiz_session_nick() {
		return this.biz_session_nick;
	}

	public void setBiz_session_nick(String biz_session_nick) {
		this.biz_session_nick = biz_session_nick;
		}

	public Integer getAdults() {
		return this.adults;
	}

	public void setAdults(Integer adults) {
		this.adults = adults;
		if(adults != null){
			putBodyParameter("adults", adults.toString());
		}
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

	public List<Journey_param_list> getJourney_param_list() {
		return this.journey_param_list;
	}

	public void setJourney_param_list(List<Journey_param_list> journey_param_list) {
		this.journey_param_list = journey_param_list;	
		if (journey_param_list != null) {
			putBodyParameter("journey_param_list" , new Gson().toJson(journey_param_list));
		}	
	}

	public Long getBiz_havana_id() {
		return this.biz_havana_id;
	}

	public void setBiz_havana_id(Long biz_havana_id) {
		this.biz_havana_id = biz_havana_id;
		}

	public Integer getChildren() {
		return this.children;
	}

	public void setChildren(Integer children) {
		this.children = children;
		if(children != null){
			putBodyParameter("children", children.toString());
		}
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

	public static class Journey_param_list {

		@SerializedName("departure_date")
		private String departure_date;

		@SerializedName("arrival_city")
		private String arrival_city;

		@SerializedName("departure_city")
		private String departure_city;

		@SerializedName("segment_param_list")
		private List<Segment_param_listItem> segment_param_list;

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

		public List<Segment_param_listItem> getSegment_param_list() {
			return this.segment_param_list;
		}

		public void setSegment_param_list(List<Segment_param_listItem> segment_param_list) {
			this.segment_param_list = segment_param_list;
		}

		public static class Segment_param_listItem {

			@SerializedName("departure_airport")
			private String departure_airport;

			@SerializedName("child_cabin")
			private String child_cabin;

			@SerializedName("arrival_city")
			private String arrival_city;

			@SerializedName("arrival_airport")
			private String arrival_airport;

			@SerializedName("cabin")
			private String cabin;

			@SerializedName("departure_city")
			private String departure_city;

			@SerializedName("marketing_flight_no")
			private String marketing_flight_no;

			@SerializedName("departure_time")
			private String departure_time;

			public String getDeparture_airport() {
				return this.departure_airport;
			}

			public void setDeparture_airport(String departure_airport) {
				this.departure_airport = departure_airport;
			}

			public String getChild_cabin() {
				return this.child_cabin;
			}

			public void setChild_cabin(String child_cabin) {
				this.child_cabin = child_cabin;
			}

			public String getArrival_city() {
				return this.arrival_city;
			}

			public void setArrival_city(String arrival_city) {
				this.arrival_city = arrival_city;
			}

			public String getArrival_airport() {
				return this.arrival_airport;
			}

			public void setArrival_airport(String arrival_airport) {
				this.arrival_airport = arrival_airport;
			}

			public String getCabin() {
				return this.cabin;
			}

			public void setCabin(String cabin) {
				this.cabin = cabin;
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

			public String getDeparture_time() {
				return this.departure_time;
			}

			public void setDeparture_time(String departure_time) {
				this.departure_time = departure_time;
			}
		}
	}

	@Override
	public Class<EnrichResponse> getResponseClass() {
		return EnrichResponse.class;
	}

}
