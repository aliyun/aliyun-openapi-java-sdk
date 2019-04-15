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
import com.aliyuncs.ecsinc.transform.v20160314.ListImageBindingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListImageBindingResponse extends AcsResponse {

	private String requestId;

	private List<ImageBinding> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ImageBinding> getData() {
		return this.data;
	}

	public void setData(List<ImageBinding> data) {
		this.data = data;
	}

	public static class ImageBinding {

		private String instanceId;

		private String imageId;

		private String imageInstanceId;

		private String regionNo;

		private String imagePc;

		private Long bindTime;

		private String chargeType;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getImageInstanceId() {
			return this.imageInstanceId;
		}

		public void setImageInstanceId(String imageInstanceId) {
			this.imageInstanceId = imageInstanceId;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getImagePc() {
			return this.imagePc;
		}

		public void setImagePc(String imagePc) {
			this.imagePc = imagePc;
		}

		public Long getBindTime() {
			return this.bindTime;
		}

		public void setBindTime(Long bindTime) {
			this.bindTime = bindTime;
		}

		public String getChargeType() {
			return this.chargeType;
		}

		public void setChargeType(String chargeType) {
			this.chargeType = chargeType;
		}
	}

	@Override
	public ListImageBindingResponse getInstance(UnmarshallerContext context) {
		return	ListImageBindingResponseUnmarshaller.unmarshall(this, context);
	}
}
