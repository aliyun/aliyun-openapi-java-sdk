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

package com.aliyuncs.eas.model.v20210701;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.eas.transform.v20210701.DescribeServiceDiagnosisResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeServiceDiagnosisResponse extends AcsResponse {

	private String requestId;

	private List<Diagnosis> diagnosisList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Diagnosis> getDiagnosisList() {
		return this.diagnosisList;
	}

	public void setDiagnosisList(List<Diagnosis> diagnosisList) {
		this.diagnosisList = diagnosisList;
	}

	public static class Diagnosis {

		private String error;

		private List<String> causes;

		private List<String> advices;

		public String getError() {
			return this.error;
		}

		public void setError(String error) {
			this.error = error;
		}

		public List<String> getCauses() {
			return this.causes;
		}

		public void setCauses(List<String> causes) {
			this.causes = causes;
		}

		public List<String> getAdvices() {
			return this.advices;
		}

		public void setAdvices(List<String> advices) {
			this.advices = advices;
		}
	}

	@Override
	public DescribeServiceDiagnosisResponse getInstance(UnmarshallerContext context) {
		return	DescribeServiceDiagnosisResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
