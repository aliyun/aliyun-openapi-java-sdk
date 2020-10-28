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

package com.aliyuncs.polardbx.transform.v20200202;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardbx.model.v20200202.DescribeParameterTemplatesResponse;
import com.aliyuncs.polardbx.model.v20200202.DescribeParameterTemplatesResponse.Data;
import com.aliyuncs.polardbx.model.v20200202.DescribeParameterTemplatesResponse.Data.TemplateRecord;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeParameterTemplatesResponseUnmarshaller {

	public static DescribeParameterTemplatesResponse unmarshall(DescribeParameterTemplatesResponse describeParameterTemplatesResponse, UnmarshallerContext _ctx) {
		
		describeParameterTemplatesResponse.setRequestId(_ctx.stringValue("DescribeParameterTemplatesResponse.RequestId"));

		Data data = new Data();
		data.setEngineVersion(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.EngineVersion"));
		data.setEngine(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.Engine"));
		data.setParameterCount(_ctx.integerValue("DescribeParameterTemplatesResponse.Data.ParameterCount"));

		List<TemplateRecord> parameters = new ArrayList<TemplateRecord>();
		for (int i = 0; i < _ctx.lengthValue("DescribeParameterTemplatesResponse.Data.Parameters.Length"); i++) {
			TemplateRecord templateRecord = new TemplateRecord();
			templateRecord.setParameterName(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].ParameterName"));
			templateRecord.setParameterValue(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].ParameterValue"));
			templateRecord.setParameterDescription(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].ParameterDescription"));
			templateRecord.setCheckingCode(_ctx.stringValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].CheckingCode"));
			templateRecord.setRevisable(_ctx.integerValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].Revisable"));
			templateRecord.setDynamic(_ctx.integerValue("DescribeParameterTemplatesResponse.Data.Parameters["+ i +"].Dynamic"));

			parameters.add(templateRecord);
		}
		data.setParameters(parameters);
		describeParameterTemplatesResponse.setData(data);
	 
	 	return describeParameterTemplatesResponse;
	}
}