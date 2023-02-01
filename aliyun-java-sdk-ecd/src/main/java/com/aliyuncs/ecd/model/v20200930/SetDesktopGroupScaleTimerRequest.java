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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetDesktopGroupScaleTimerRequest extends RpcAcsRequest<SetDesktopGroupScaleTimerResponse> {
	   

	private String desktopGroupId;

	private List<ScaleTimerInfos> scaleTimerInfoss;
	public SetDesktopGroupScaleTimerRequest() {
		super("ecd", "2020-09-30", "SetDesktopGroupScaleTimer");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDesktopGroupId() {
		return this.desktopGroupId;
	}

	public void setDesktopGroupId(String desktopGroupId) {
		this.desktopGroupId = desktopGroupId;
		if(desktopGroupId != null){
			putQueryParameter("DesktopGroupId", desktopGroupId);
		}
	}

	public List<ScaleTimerInfos> getScaleTimerInfoss() {
		return this.scaleTimerInfoss;
	}

	public void setScaleTimerInfoss(List<ScaleTimerInfos> scaleTimerInfoss) {
		this.scaleTimerInfoss = scaleTimerInfoss;	
		if (scaleTimerInfoss != null) {
			for (int depth1 = 0; depth1 < scaleTimerInfoss.size(); depth1++) {
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".KeepDuration" , scaleTimerInfoss.get(depth1).getKeepDuration());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".MinResAmount" , scaleTimerInfoss.get(depth1).getMinResAmount());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".Cron" , scaleTimerInfoss.get(depth1).getCron());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".BuyResAmount" , scaleTimerInfoss.get(depth1).getBuyResAmount());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".MaxResAmount" , scaleTimerInfoss.get(depth1).getMaxResAmount());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".Type" , scaleTimerInfoss.get(depth1).getType());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".LoadPolicy" , scaleTimerInfoss.get(depth1).getLoadPolicy());
				putQueryParameter("ScaleTimerInfos." + (depth1 + 1) + ".RatioThreshold" , scaleTimerInfoss.get(depth1).getRatioThreshold());
			}
		}	
	}

	public static class ScaleTimerInfos {

		private Long keepDuration;

		private Integer minResAmount;

		private String cron;

		private Integer buyResAmount;

		private Integer maxResAmount;

		private String type;

		private Integer loadPolicy;

		private Float ratioThreshold;

		public Long getKeepDuration() {
			return this.keepDuration;
		}

		public void setKeepDuration(Long keepDuration) {
			this.keepDuration = keepDuration;
		}

		public Integer getMinResAmount() {
			return this.minResAmount;
		}

		public void setMinResAmount(Integer minResAmount) {
			this.minResAmount = minResAmount;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public Integer getBuyResAmount() {
			return this.buyResAmount;
		}

		public void setBuyResAmount(Integer buyResAmount) {
			this.buyResAmount = buyResAmount;
		}

		public Integer getMaxResAmount() {
			return this.maxResAmount;
		}

		public void setMaxResAmount(Integer maxResAmount) {
			this.maxResAmount = maxResAmount;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Integer getLoadPolicy() {
			return this.loadPolicy;
		}

		public void setLoadPolicy(Integer loadPolicy) {
			this.loadPolicy = loadPolicy;
		}

		public Float getRatioThreshold() {
			return this.ratioThreshold;
		}

		public void setRatioThreshold(Float ratioThreshold) {
			this.ratioThreshold = ratioThreshold;
		}
	}

	@Override
	public Class<SetDesktopGroupScaleTimerResponse> getResponseClass() {
		return SetDesktopGroupScaleTimerResponse.class;
	}

}
