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
import com.aliyuncs.imageprocess.transform.v20200320.DetectPancResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectPancResponse extends AcsResponse {

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

			private String pancVol;

			private String pdacVol;

			private String nonPdacVol;

			private String mask;

			private List<String> possibilities;

			public String getPancVol() {
				return this.pancVol;
			}

			public void setPancVol(String pancVol) {
				this.pancVol = pancVol;
			}

			public String getPdacVol() {
				return this.pdacVol;
			}

			public void setPdacVol(String pdacVol) {
				this.pdacVol = pdacVol;
			}

			public String getNonPdacVol() {
				return this.nonPdacVol;
			}

			public void setNonPdacVol(String nonPdacVol) {
				this.nonPdacVol = nonPdacVol;
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
	public DetectPancResponse getInstance(UnmarshallerContext context) {
		return	DetectPancResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
