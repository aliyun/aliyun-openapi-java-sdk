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

package com.aliyuncs.cloudwf.model.v20170328;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ConfigAutoRenewRequest extends RpcAcsRequest<ConfigAutoRenewResponse> {
	
	public ConfigAutoRenewRequest() {
		super("cloudwf", "2017-03-28", "ConfigAutoRenew", "cloudwf");
	}

	private Integer offsetDays;

	private Integer months;

	private Boolean autoRenew;

	private List<String> apLists;

	public Integer getOffsetDays() {
		return this.offsetDays;
	}

	public void setOffsetDays(Integer offsetDays) {
		this.offsetDays = offsetDays;
		if(offsetDays != null){
			putQueryParameter("OffsetDays", offsetDays.toString());
		}
	}

	public Integer getMonths() {
		return this.months;
	}

	public void setMonths(Integer months) {
		this.months = months;
		if(months != null){
			putQueryParameter("Months", months.toString());
		}
	}

	public Boolean getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(Boolean autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew.toString());
		}
	}

	public List<String> getApLists() {
		return this.apLists;
	}

	public void setApLists(List<String> apLists) {
		this.apLists = apLists;	
		if (apLists != null) {
			for (int i = 0; i < apLists.size(); i++) {
				putQueryParameter("ApList." + (i + 1) , apLists.get(i));
			}
		}	
	}

	@Override
	public Class<ConfigAutoRenewResponse> getResponseClass() {
		return ConfigAutoRenewResponse.class;
	}

}
