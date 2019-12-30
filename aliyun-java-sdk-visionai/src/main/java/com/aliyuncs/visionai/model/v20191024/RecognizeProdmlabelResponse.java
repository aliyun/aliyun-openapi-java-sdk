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

package com.aliyuncs.visionai.model.v20191024;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.visionai.transform.v20191024.RecognizeProdmlabelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeProdmlabelResponse extends AcsResponse {

	private String requestId;

	private List<CommodityAttributeLabel> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CommodityAttributeLabel> getData() {
		return this.data;
	}

	public void setData(List<CommodityAttributeLabel> data) {
		this.data = data;
	}

	public static class CommodityAttributeLabel {

		private Float score;

		private Long propertyId;

		private String propertyName;

		private Long subId;

		private String propertyValue;

		public Float getScore() {
			return this.score;
		}

		public void setScore(Float score) {
			this.score = score;
		}

		public Long getPropertyId() {
			return this.propertyId;
		}

		public void setPropertyId(Long propertyId) {
			this.propertyId = propertyId;
		}

		public String getPropertyName() {
			return this.propertyName;
		}

		public void setPropertyName(String propertyName) {
			this.propertyName = propertyName;
		}

		public Long getSubId() {
			return this.subId;
		}

		public void setSubId(Long subId) {
			this.subId = subId;
		}

		public String getPropertyValue() {
			return this.propertyValue;
		}

		public void setPropertyValue(String propertyValue) {
			this.propertyValue = propertyValue;
		}
	}

	@Override
	public RecognizeProdmlabelResponse getInstance(UnmarshallerContext context) {
		return	RecognizeProdmlabelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
