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

package com.aliyuncs.live.model.v20161101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeCastersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeCastersResponse extends AcsResponse {

	private Integer total;

	private String requestId;

	private List<Caster> casterList;

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Caster> getCasterList() {
		return this.casterList;
	}

	public void setCasterList(List<Caster> casterList) {
		this.casterList = casterList;
	}

	public static class Caster {

		private Integer status;

		private String purchaseTime;

		private String expireTime;

		private String createTime;

		private String casterName;

		private String chargeType;

		private String casterTemplate;

		private Integer roomId;

		private String casterId;

		private Integer channelEnable;

		private String lastModified;

		private String startTime;

		private Integer normType;

		private String duration;

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public String getPurchaseTime() {
			return this.purchaseTime;
		}

		public void setPurchaseTime(String purchaseTime) {
			this.purchaseTime = purchaseTime;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getCasterName() {
			return this.casterName;
		}

		public void setCasterName(String casterName) {
			this.casterName = casterName;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}

		public String getCasterTemplate() {
			return this.casterTemplate;
		}

		public void setCasterTemplate(String casterTemplate) {
			this.casterTemplate = casterTemplate;
		}

		public Integer getRoomId() {
			return this.roomId;
		}

		public void setRoomId(Integer roomId) {
			this.roomId = roomId;
		}

		public String getCasterId() {
			return this.casterId;
		}

		public void setCasterId(String casterId) {
			this.casterId = casterId;
		}

		public Integer getChannelEnable() {
			return this.channelEnable;
		}

		public void setChannelEnable(Integer channelEnable) {
			this.channelEnable = channelEnable;
		}

		public String getLastModified() {
			return this.lastModified;
		}

		public void setLastModified(String lastModified) {
			this.lastModified = lastModified;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public Integer getNormType() {
			return this.normType;
		}

		public void setNormType(Integer normType) {
			this.normType = normType;
		}

		public String getDuration() {
			return this.duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}
	}

	@Override
	public DescribeCastersResponse getInstance(UnmarshallerContext context) {
		return	DescribeCastersResponseUnmarshaller.unmarshall(this, context);
	}
}
