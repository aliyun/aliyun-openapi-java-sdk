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

package com.aliyuncs.smartag.model.v20180313;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smartag.transform.v20180313.DescribeSagVbrRelationsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSagVbrRelationsResponse extends AcsResponse {

	private String requestId;

	private List<SagVbrRelation> sagVbrRelations;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<SagVbrRelation> getSagVbrRelations() {
		return this.sagVbrRelations;
	}

	public void setSagVbrRelations(List<SagVbrRelation> sagVbrRelations) {
		this.sagVbrRelations = sagVbrRelations;
	}

	public static class SagVbrRelation {

		private String vbrInstanceId;

		private String sagInstanceId;

		private String sagUid;

		public String getVbrInstanceId() {
			return this.vbrInstanceId;
		}

		public void setVbrInstanceId(String vbrInstanceId) {
			this.vbrInstanceId = vbrInstanceId;
		}

		public String getSagInstanceId() {
			return this.sagInstanceId;
		}

		public void setSagInstanceId(String sagInstanceId) {
			this.sagInstanceId = sagInstanceId;
		}

		public String getSagUid() {
			return this.sagUid;
		}

		public void setSagUid(String sagUid) {
			this.sagUid = sagUid;
		}
	}

	@Override
	public DescribeSagVbrRelationsResponse getInstance(UnmarshallerContext context) {
		return	DescribeSagVbrRelationsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
