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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeParameterTemplatesResponse;
import com.aliyuncs.dds.model.v20151201.DescribeParameterTemplatesResponse.TemplateRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterTemplatesResponseUnmarshaller {

	public static DescribeParameterTemplatesResponse unmarshall(DescribeParameterTemplatesResponse describeParameterTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeParameterTemplatesResponse.setRequestId(_ctx.stringValue("DescribeParameterTemplatesResponse.RequestId"));
		describeParameterTemplatesResponse.setEngine(_ctx.stringValue("DescribeParameterTemplatesResponse.Engine"));
		describeParameterTemplatesResponse.setEngineVersion(_ctx.stringValue("DescribeParameterTemplatesResponse.EngineVersion"));
		describeParameterTemplatesResponse.setParameterCount(_ctx.stringValue("DescribeParameterTemplatesResponse.ParameterCount"));

		List<TemplateRecord> parameters = new ArrayList<TemplateRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterTemplatesResponse.Parameters.Length"); i++) {
			TemplateRecord templateRecord = new TemplateRecord();
			templateRecord.setParameterName(_ctx.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterName"));
			templateRecord.setParameterValue(_ctx.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterValue"));
			templateRecord.setForceModify(_ctx.booleanValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ForceModify"));
			templateRecord.setForceRestart(_ctx.booleanValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ForceRestart"));
			templateRecord.setCheckingCode(_ctx.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].CheckingCode"));
			templateRecord.setParameterDescription(_ctx.stringValue("DescribeParameterTemplatesResponse.Parameters["+ i +"].ParameterDescription"));

			parameters.add(templateRecord);
		}
		describeParameterTemplatesResponse.setParameters(parameters);
	 
	 	return describeParameterTemplatesResponse;
	}
}