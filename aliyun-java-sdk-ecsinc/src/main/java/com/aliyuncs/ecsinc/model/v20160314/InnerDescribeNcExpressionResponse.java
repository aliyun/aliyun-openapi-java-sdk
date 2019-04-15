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
import com.aliyuncs.ecsinc.transform.v20160314.InnerDescribeNcExpressionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class InnerDescribeNcExpressionResponse extends AcsResponse {

	private String requestId;

	private Boolean finished;

	private Integer totalNcCount;

	private Integer finishedNcCount;

	private List<String> unfinishedNcIpSet;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getFinished() {
		return this.finished;
	}

	public void setFinished(Boolean finished) {
		this.finished = finished;
	}

	public Integer getTotalNcCount() {
		return this.totalNcCount;
	}

	public void setTotalNcCount(Integer totalNcCount) {
		this.totalNcCount = totalNcCount;
	}

	public Integer getFinishedNcCount() {
		return this.finishedNcCount;
	}

	public void setFinishedNcCount(Integer finishedNcCount) {
		this.finishedNcCount = finishedNcCount;
	}

	public List<String> getUnfinishedNcIpSet() {
		return this.unfinishedNcIpSet;
	}

	public void setUnfinishedNcIpSet(List<String> unfinishedNcIpSet) {
		this.unfinishedNcIpSet = unfinishedNcIpSet;
	}

	@Override
	public InnerDescribeNcExpressionResponse getInstance(UnmarshallerContext context) {
		return	InnerDescribeNcExpressionResponseUnmarshaller.unmarshall(this, context);
	}
}
