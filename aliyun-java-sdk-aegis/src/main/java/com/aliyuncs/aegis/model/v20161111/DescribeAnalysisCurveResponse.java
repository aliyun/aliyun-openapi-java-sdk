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

package com.aliyuncs.aegis.model.v20161111;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.aegis.transform.v20161111.DescribeAnalysisCurveResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnalysisCurveResponse extends AcsResponse {

	private String requestId;

	private Curves curves;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Curves getCurves() {
		return this.curves;
	}

	public void setCurves(Curves curves) {
		this.curves = curves;
	}

	public static class Curves {

		private List<OriginalCurve> originalCurveList;

		private List<ResultCurve> resultCurveList;

		public List<OriginalCurve> getOriginalCurveList() {
			return this.originalCurveList;
		}

		public void setOriginalCurveList(List<OriginalCurve> originalCurveList) {
			this.originalCurveList = originalCurveList;
		}

		public List<ResultCurve> getResultCurveList() {
			return this.resultCurveList;
		}

		public void setResultCurveList(List<ResultCurve> resultCurveList) {
			this.resultCurveList = resultCurveList;
		}

		public static class OriginalCurve {

			private Integer count;

			private Long dsTimestamp;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Long getDsTimestamp() {
				return this.dsTimestamp;
			}

			public void setDsTimestamp(Long dsTimestamp) {
				this.dsTimestamp = dsTimestamp;
			}
		}

		public static class ResultCurve {

			private Integer count;

			private Long dsTimestamp;

			public Integer getCount() {
				return this.count;
			}

			public void setCount(Integer count) {
				this.count = count;
			}

			public Long getDsTimestamp() {
				return this.dsTimestamp;
			}

			public void setDsTimestamp(Long dsTimestamp) {
				this.dsTimestamp = dsTimestamp;
			}
		}
	}

	@Override
	public DescribeAnalysisCurveResponse getInstance(UnmarshallerContext context) {
		return	DescribeAnalysisCurveResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
