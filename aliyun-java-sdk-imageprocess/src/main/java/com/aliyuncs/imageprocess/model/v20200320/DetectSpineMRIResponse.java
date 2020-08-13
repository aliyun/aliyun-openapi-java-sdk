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
import com.aliyuncs.imageprocess.transform.v20200320.DetectSpineMRIResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DetectSpineMRIResponse extends AcsResponse {

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

		private List<Disc> discs;

		private List<Vertebra> vertebras;

		public List<Disc> getDiscs() {
			return this.discs;
		}

		public void setDiscs(List<Disc> discs) {
			this.discs = discs;
		}

		public List<Vertebra> getVertebras() {
			return this.vertebras;
		}

		public void setVertebras(List<Vertebra> vertebras) {
			this.vertebras = vertebras;
		}

		public static class Disc {

			private String disease;

			private String identification;

			private List<Float> location;

			public String getDisease() {
				return this.disease;
			}

			public void setDisease(String disease) {
				this.disease = disease;
			}

			public String getIdentification() {
				return this.identification;
			}

			public void setIdentification(String identification) {
				this.identification = identification;
			}

			public List<Float> getLocation() {
				return this.location;
			}

			public void setLocation(List<Float> location) {
				this.location = location;
			}
		}

		public static class Vertebra {

			private String disease;

			private String identification;

			private List<Float> location1;

			public String getDisease() {
				return this.disease;
			}

			public void setDisease(String disease) {
				this.disease = disease;
			}

			public String getIdentification() {
				return this.identification;
			}

			public void setIdentification(String identification) {
				this.identification = identification;
			}

			public List<Float> getLocation1() {
				return this.location1;
			}

			public void setLocation1(List<Float> location1) {
				this.location1 = location1;
			}
		}
	}

	@Override
	public DetectSpineMRIResponse getInstance(UnmarshallerContext context) {
		return	DetectSpineMRIResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
