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

package com.aliyuncs.alimt.model.v20181012;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alimt.transform.v20181012.TranslateCertificateResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class TranslateCertificateResponse extends AcsResponse {

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

		private List<CertificateTranslateItemDTO> translatedValues;

		public List<CertificateTranslateItemDTO> getTranslatedValues() {
			return this.translatedValues;
		}

		public void setTranslatedValues(List<CertificateTranslateItemDTO> translatedValues) {
			this.translatedValues = translatedValues;
		}

		public static class CertificateTranslateItemDTO {

			private String key;

			private String value;

			private String valueTranslation;

			private String keyTranslation;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}

			public String getValueTranslation() {
				return this.valueTranslation;
			}

			public void setValueTranslation(String valueTranslation) {
				this.valueTranslation = valueTranslation;
			}

			public String getKeyTranslation() {
				return this.keyTranslation;
			}

			public void setKeyTranslation(String keyTranslation) {
				this.keyTranslation = keyTranslation;
			}
		}
	}

	@Override
	public TranslateCertificateResponse getInstance(UnmarshallerContext context) {
		return	TranslateCertificateResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
