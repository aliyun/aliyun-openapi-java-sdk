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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeConstraintsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeConstraintsResponse.SupportedResourceModel;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeConstraintsResponseUnmarshaller {

	public static OpsDescribeConstraintsResponse unmarshall(OpsDescribeConstraintsResponse opsDescribeConstraintsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeConstraintsResponse.setRequestId(_ctx.stringValue("OpsDescribeConstraintsResponse.RequestId"));
		opsDescribeConstraintsResponse.setName(_ctx.stringValue("OpsDescribeConstraintsResponse.Name"));

		List<SupportedResourceModel> constraintInfo = new ArrayList<SupportedResourceModel>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeConstraintsResponse.ConstraintInfo.Length"); i++) {
			SupportedResourceModel supportedResourceModel = new SupportedResourceModel();
			supportedResourceModel.setValue(_ctx.stringValue("OpsDescribeConstraintsResponse.ConstraintInfo["+ i +"].Value"));
			supportedResourceModel.setMax(_ctx.integerValue("OpsDescribeConstraintsResponse.ConstraintInfo["+ i +"].Max"));
			supportedResourceModel.setMin(_ctx.integerValue("OpsDescribeConstraintsResponse.ConstraintInfo["+ i +"].Min"));
			supportedResourceModel.setUnit(_ctx.stringValue("OpsDescribeConstraintsResponse.ConstraintInfo["+ i +"].Unit"));

			constraintInfo.add(supportedResourceModel);
		}
		opsDescribeConstraintsResponse.setConstraintInfo(constraintInfo);
	 
	 	return opsDescribeConstraintsResponse;
	}
}