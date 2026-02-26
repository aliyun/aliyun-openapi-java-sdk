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

package com.aliyuncs.cloud_siem.transform.v20220616;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceInstanceResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceInstanceResponse.Data;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceInstanceResponse.Data.DataSourceInstanceParam;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceInstanceResponseUnmarshaller {

	public static DescribeDataSourceInstanceResponse unmarshall(DescribeDataSourceInstanceResponse describeDataSourceInstanceResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceInstanceResponse.setRequestId(_ctx.stringValue("DescribeDataSourceInstanceResponse.RequestId"));

		Data data = new Data();
		data.setDataSourceInstanceId(_ctx.stringValue("DescribeDataSourceInstanceResponse.Data.DataSourceInstanceId"));
		data.setAccountId(_ctx.stringValue("DescribeDataSourceInstanceResponse.Data.AccountId"));
		data.setCloudCode(_ctx.stringValue("DescribeDataSourceInstanceResponse.Data.CloudCode"));

		List<DataSourceInstanceParam> dataSourceInstanceParams = new ArrayList<DataSourceInstanceParam>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourceInstanceResponse.Data.DataSourceInstanceParams.Length"); i++) {
			DataSourceInstanceParam dataSourceInstanceParam = new DataSourceInstanceParam();
			dataSourceInstanceParam.setParaCode(_ctx.stringValue("DescribeDataSourceInstanceResponse.Data.DataSourceInstanceParams["+ i +"].ParaCode"));
			dataSourceInstanceParam.setParaValue(_ctx.stringValue("DescribeDataSourceInstanceResponse.Data.DataSourceInstanceParams["+ i +"].ParaValue"));

			dataSourceInstanceParams.add(dataSourceInstanceParam);
		}
		data.setDataSourceInstanceParams(dataSourceInstanceParams);
		describeDataSourceInstanceResponse.setData(data);
	 
	 	return describeDataSourceInstanceResponse;
	}
}