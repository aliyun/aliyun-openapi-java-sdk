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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupTemplateListResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeParameterGroupTemplateListResponse.ParametersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterGroupTemplateListResponseUnmarshaller {

	public static DescribeParameterGroupTemplateListResponse unmarshall(DescribeParameterGroupTemplateListResponse describeParameterGroupTemplateListResponse, UnmarshallerContext _ctx) {
		
		describeParameterGroupTemplateListResponse.setRequestId(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.RequestId"));
		describeParameterGroupTemplateListResponse.setEngineVersion(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.EngineVersion"));

		List<ParametersItem> parameters = new ArrayList<ParametersItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterGroupTemplateListResponse.Parameters.Length"); i++) {
			ParametersItem parametersItem = new ParametersItem();
			parametersItem.setSupportModifyForMinorVersion(_ctx.booleanValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].SupportModifyForMinorVersion"));
			parametersItem.setCheckingCode(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].CheckingCode"));
			parametersItem.setParameterValue(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].ParameterValue"));
			parametersItem.setRevisable(_ctx.longValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].Revisable"));
			parametersItem.setFactor(_ctx.longValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].Factor"));
			parametersItem.setParameterName(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].ParameterName"));
			parametersItem.setUnit(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].Unit"));
			parametersItem.setParameterDescription(_ctx.stringValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].ParameterDescription"));
			parametersItem.setEffective(_ctx.longValue("DescribeParameterGroupTemplateListResponse.Parameters["+ i +"].Effective"));

			parameters.add(parametersItem);
		}
		describeParameterGroupTemplateListResponse.setParameters(parameters);
	 
	 	return describeParameterGroupTemplateListResponse;
	}
}