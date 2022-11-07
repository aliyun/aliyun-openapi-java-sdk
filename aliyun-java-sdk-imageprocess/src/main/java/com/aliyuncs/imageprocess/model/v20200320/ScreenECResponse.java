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

package com.aliyuncs.imageprocess.model.v20200320;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.imageprocess.transform.v20200320.ScreenECResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ScreenECResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Lesion lesion;

		public Lesion getLesion() {
			return this.lesion;
		}

		public void setLesion(Lesion lesion) {
			this.lesion = lesion;
		}

		public static class Lesion {

			private String esoVolume;

			private String ecVolume;

			private String benignVolume;

			private String mask;

			private List<String> possibilities;

			public String getEsoVolume() {
				return this.esoVolume;
			}

			public void setEsoVolume(String esoVolume) {
				this.esoVolume = esoVolume;
			}

			public String getEcVolume() {
				return this.ecVolume;
			}

			public void setEcVolume(String ecVolume) {
				this.ecVolume = ecVolume;
			}

			public String getBenignVolume() {
				return this.benignVolume;
			}

			public void setBenignVolume(String benignVolume) {
				this.benignVolume = benignVolume;
			}

			public String getMask() {
				return this.mask;
			}

			public void setMask(String mask) {
				this.mask = mask;
			}

			public List<String> getPossibilities() {
				return this.possibilities;
			}

			public void setPossibilities(List<String> possibilities) {
				this.possibilities = possibilities;
			}
		}
	}

	@Override
	public ScreenECResponse getInstance(UnmarshallerContext context) {
		return	ScreenECResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
