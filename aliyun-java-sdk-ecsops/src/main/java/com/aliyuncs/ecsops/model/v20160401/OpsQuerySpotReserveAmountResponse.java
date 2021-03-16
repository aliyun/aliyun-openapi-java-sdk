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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQuerySpotReserveAmountResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQuerySpotReserveAmountResponse extends AcsResponse {

	private String requestId;

	private List<EcsSpotDurationReserveVmStock> ecsSpotDurationReserveVmStocks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EcsSpotDurationReserveVmStock> getEcsSpotDurationReserveVmStocks() {
		return this.ecsSpotDurationReserveVmStocks;
	}

	public void setEcsSpotDurationReserveVmStocks(List<EcsSpotDurationReserveVmStock> ecsSpotDurationReserveVmStocks) {
		this.ecsSpotDurationReserveVmStocks = ecsSpotDurationReserveVmStocks;
	}

	public static class EcsSpotDurationReserveVmStock {

		private Long id;

		private String gmtCreate;

		private String gmtModified;

		private String izNo;

		private String flavorFamily;

		private String flavor;

		private Integer networkType;

		private Integer ioOptimized;

		private Integer spotDuration;

		private Integer reserveAmount;

		private String bizHour;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getIzNo() {
			return this.izNo;
		}

		public void setIzNo(String izNo) {
			this.izNo = izNo;
		}

		public String getFlavorFamily() {
			return this.flavorFamily;
		}

		public void setFlavorFamily(String flavorFamily) {
			this.flavorFamily = flavorFamily;
		}

		public String getFlavor() {
			return this.flavor;
		}

		public void setFlavor(String flavor) {
			this.flavor = flavor;
		}

		public Integer getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(Integer networkType) {
			this.networkType = networkType;
		}

		public Integer getIoOptimized() {
			return this.ioOptimized;
		}

		public void setIoOptimized(Integer ioOptimized) {
			this.ioOptimized = ioOptimized;
		}

		public Integer getSpotDuration() {
			return this.spotDuration;
		}

		public void setSpotDuration(Integer spotDuration) {
			this.spotDuration = spotDuration;
		}

		public Integer getReserveAmount() {
			return this.reserveAmount;
		}

		public void setReserveAmount(Integer reserveAmount) {
			this.reserveAmount = reserveAmount;
		}

		public String getBizHour() {
			return this.bizHour;
		}

		public void setBizHour(String bizHour) {
			this.bizHour = bizHour;
		}
	}

	@Override
	public OpsQuerySpotReserveAmountResponse getInstance(UnmarshallerContext context) {
		return	OpsQuerySpotReserveAmountResponseUnmarshaller.unmarshall(this, context);
	}
}
