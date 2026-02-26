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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeDetailListOfBuyerRequest extends RoaAcsRequest<ChangeDetailListOfBuyerResponse> {
	   

	private String biz_language;

	private String biz_currency;

	private String biz_session_nick;

	private Long biz_havana_id;

	private String biz_zone_id;

	private String xacsairticketaccesstoken;

	private Integer page_index;

	private Long biz_session_uid;

	private Long utc_create_begin;

	private Long utc_create_end;

	private String xacsairticketlanguage;

	private Integer page_size;

	private String biz_app_key;
	public ChangeDetailListOfBuyerRequest() {
		super("airticketOpen", "2023-01-17", "ChangeDetailListOfBuyer");
		setUriPattern("/airticket/v1/change/buyer/detail-list");
		setMethod(MethodType.GET);
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

	public Integer getPage_index() {
		return this.page_index;
	}

	public void setPage_index(Integer page_index) {
		this.page_index = page_index;
		if(page_index != null){
			putQueryParameter("page_index", page_index.toString());
		}
	}

	public Long getBiz_session_uid() {
		return this.biz_session_uid;
	}

	public void setBiz_session_uid(Long biz_session_uid) {
		this.biz_session_uid = biz_session_uid;
		}

	public Long getUtc_create_begin() {
		return this.utc_create_begin;
	}

	public void setUtc_create_begin(Long utc_create_begin) {
		this.utc_create_begin = utc_create_begin;
		if(utc_create_begin != null){
			putQueryParameter("utc_create_begin", utc_create_begin.toString());
		}
	}

	public Long getUtc_create_end() {
		return this.utc_create_end;
	}

	public void setUtc_create_end(Long utc_create_end) {
		this.utc_create_end = utc_create_end;
		if(utc_create_end != null){
			putQueryParameter("utc_create_end", utc_create_end.toString());
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

	public Integer getPage_size() {
		return this.page_size;
	}

	public void setPage_size(Integer page_size) {
		this.page_size = page_size;
		if(page_size != null){
			putQueryParameter("page_size", page_size.toString());
		}
	}

	public String getBiz_app_key() {
		return this.biz_app_key;
	}

	public void setBiz_app_key(String biz_app_key) {
		this.biz_app_key = biz_app_key;
		}

	@Override
	public Class<ChangeDetailListOfBuyerResponse> getResponseClass() {
		return ChangeDetailListOfBuyerResponse.class;
	}

}
