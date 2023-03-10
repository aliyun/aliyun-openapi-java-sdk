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
public class RefundApplyRequest extends RoaAcsRequest<RefundApplyResponse> {
	   

	private String biz_language;

	private String biz_currency;

	@SerializedName("refund_type")
	private Refund_type refund_type;

	private String biz_session_nick;

	@SerializedName("refund_passenger_list")
	private List<Refund_passenger_list> refund_passenger_list;

	private Long biz_havana_id;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	private Long biz_session_uid;

	private Long order_num;

	@SerializedName("refund_journeys")
	private List<Refund_journeys> refund_journeys;

	private String xacsairticketlanguage;

	private String biz_app_key;
	public RefundApplyRequest() {
		super("airticketOpen", "2023-01-17", "RefundApply");
		setUriPattern("/airticket/v1/refund/action-apply");
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

	public Refund_type getRefund_type() {
		return this.refund_type;
	}

	public void setRefund_type(Refund_type refund_type) {
		this.refund_type = refund_type;	
		if (refund_type != null) {
			putBodyParameter("refund_type" , new Gson().toJson(refund_type));
		}	
	}

	public String getBiz_session_nick() {
		return this.biz_session_nick;
	}

	public void setBiz_session_nick(String biz_session_nick) {
		this.biz_session_nick = biz_session_nick;
		}

	public List<Refund_passenger_list> getRefund_passenger_list() {
		return this.refund_passenger_list;
	}

	public void setRefund_passenger_list(List<Refund_passenger_list> refund_passenger_list) {
		this.refund_passenger_list = refund_passenger_list;	
		if (refund_passenger_list != null) {
			putBodyParameter("refund_passenger_list" , new Gson().toJson(refund_passenger_list));
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

	public List<Refund_journeys> getRefund_journeys() {
		return this.refund_journeys;
	}

	public void setRefund_journeys(List<Refund_journeys> refund_journeys) {
		this.refund_journeys = refund_journeys;	
		if (refund_journeys != null) {
			putBodyParameter("refund_journeys" , new Gson().toJson(refund_journeys));
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

	public static class Refund_type {

		@SerializedName("file")
		private List<String> file;

		@SerializedName("refund_type_id")
		private Integer refund_type_id;

		@SerializedName("remark")
		private String remark;

		public List<String> getFile() {
			return this.file;
		}

		public void setFile(List<String> file) {
			this.file = file;
		}

		public Integer getRefund_type_id() {
			return this.refund_type_id;
		}

		public void setRefund_type_id(Integer refund_type_id) {
			this.refund_type_id = refund_type_id;
		}

		public String getRemark() {
			return this.remark;
		}

		public void setRemark(String remark) {
			this.remark = remark;
		}
	}

	public static class Refund_passenger_list {

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

	public static class Refund_journeys {

		@SerializedName("segment_list")
		private List<Segment_listItem> segment_list;

		public List<Segment_listItem> getSegment_list() {
			return this.segment_list;
		}

		public void setSegment_list(List<Segment_listItem> segment_list) {
			this.segment_list = segment_list;
		}

		public static class Segment_listItem {

			@SerializedName("departure_airport")
			private String departure_airport;

			@SerializedName("arrival_airport")
			private String arrival_airport;

			@SerializedName("arrival_city")
			private String arrival_city;

			@SerializedName("departure_city")
			private String departure_city;

			public String getDeparture_airport() {
				return this.departure_airport;
			}

			public void setDeparture_airport(String departure_airport) {
				this.departure_airport = departure_airport;
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

			public String getDeparture_city() {
				return this.departure_city;
			}

			public void setDeparture_city(String departure_city) {
				this.departure_city = departure_city;
			}
		}
	}

	@Override
	public Class<RefundApplyResponse> getResponseClass() {
		return RefundApplyResponse.class;
	}

}
