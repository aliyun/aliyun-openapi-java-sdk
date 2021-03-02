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

package com.aliyuncs.alidns.model.v20150109;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomLineRequest extends RpcAcsRequest<UpdateCustomLineResponse> {
	   

	private Long lineId;

	private List<IpSegment> ipSegments;

	private String lineName;

	private String lang;
	public UpdateCustomLineRequest() {
		super("Alidns", "2015-01-09", "UpdateCustomLine", "alidns");
		setMethod(MethodType.POST);
	}

	public Long getLineId() {
		return this.lineId;
	}

	public void setLineId(Long lineId) {
		this.lineId = lineId;
		if(lineId != null){
			putQueryParameter("LineId", lineId.toString());
		}
	}

	public List<IpSegment> getIpSegments() {
		return this.ipSegments;
	}

	public void setIpSegments(List<IpSegment> ipSegments) {
		this.ipSegments = ipSegments;	
		if (ipSegments != null) {
			for (int depth1 = 0; depth1 < ipSegments.size(); depth1++) {
				putQueryParameter("IpSegment." + (depth1 + 1) + ".EndIp" , ipSegments.get(depth1).getEndIp());
				putQueryParameter("IpSegment." + (depth1 + 1) + ".StartIp" , ipSegments.get(depth1).getStartIp());
			}
		}	
	}

	public String getLineName() {
		return this.lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
		if(lineName != null){
			putQueryParameter("LineName", lineName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public static class IpSegment {

		private String endIp;

		private String startIp;

		public String getEndIp() {
			return this.endIp;
		}

		public void setEndIp(String endIp) {
			this.endIp = endIp;
		}

		public String getStartIp() {
			return this.startIp;
		}

		public void setStartIp(String startIp) {
			this.startIp = startIp;
		}
	}

	@Override
	public Class<UpdateCustomLineResponse> getResponseClass() {
		return UpdateCustomLineResponse.class;
	}

}
