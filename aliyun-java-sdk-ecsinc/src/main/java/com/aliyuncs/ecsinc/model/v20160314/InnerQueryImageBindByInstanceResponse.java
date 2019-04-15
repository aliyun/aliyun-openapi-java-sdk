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

package com.aliyuncs.ecsinc.model.v20160314;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsinc.transform.v20160314.InnerQueryImageBindByInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerQueryImageBindByInstanceResponse extends AcsResponse {

	private String requestId;

	private List<Item> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Item> getData() {
		return this.data;
	}

	public void setData(List<Item> data) {
		this.data = data;
	}

	public static class Item {

		private String imageInstanceId;

		private String imageId;

		private String instanceId;

		private String imagePc;

		private String region;

		private Integer bindStatus;

		private Long bindTime;

		private Long unbindTime;

		private String chargeType;

		public String getImageInstanceId() {
			return this.imageInstanceId;
		}

		public void setImageInstanceId(String imageInstanceId) {
			this.imageInstanceId = imageInstanceId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImagePc() {
			return this.imagePc;
		}

		public void setImagePc(String imagePc) {
			this.imagePc = imagePc;
		}

		public String getRegion() {
			return this.region;
		}

		public void setRegion(String region) {
			this.region = region;
		}

		public Integer getBindStatus() {
			return this.bindStatus;
		}

		public void setBindStatus(Integer bindStatus) {
			this.bindStatus = bindStatus;
		}

		public Long getBindTime() {
			return this.bindTime;
		}

		public void setBindTime(Long bindTime) {
			this.bindTime = bindTime;
		}

		public Long getUnbindTime() {
			return this.unbindTime;
		}

		public void setUnbindTime(Long unbindTime) {
			this.unbindTime = unbindTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}
	}

	@Override
	public InnerQueryImageBindByInstanceResponse getInstance(UnmarshallerContext context) {
		return	InnerQueryImageBindByInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
