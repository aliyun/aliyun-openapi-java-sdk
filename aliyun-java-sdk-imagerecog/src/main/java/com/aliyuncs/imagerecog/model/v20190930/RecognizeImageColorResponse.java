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

package com.aliyuncs.imagerecog.model.v20190930;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imagerecog.transform.v20190930.RecognizeImageColorResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeImageColorResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ColorTemplate> colorTemplateList;

		public List<ColorTemplate> getColorTemplateList() {
			return this.colorTemplateList;
		}

		public void setColorTemplateList(List<ColorTemplate> colorTemplateList) {
			this.colorTemplateList = colorTemplateList;
		}

		public static class ColorTemplate {

			private String color;

			private String label;

			private Float percentage;

			public String getColor() {
				return this.color;
			}

			public void setColor(String color) {
				this.color = color;
			}

			public String getLabel() {
				return this.label;
			}

			public void setLabel(String label) {
				this.label = label;
			}

			public Float getPercentage() {
				return this.percentage;
			}

			public void setPercentage(Float percentage) {
				this.percentage = percentage;
			}
		}
	}

	@Override
	public RecognizeImageColorResponse getInstance(UnmarshallerContext context) {
		return	RecognizeImageColorResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
