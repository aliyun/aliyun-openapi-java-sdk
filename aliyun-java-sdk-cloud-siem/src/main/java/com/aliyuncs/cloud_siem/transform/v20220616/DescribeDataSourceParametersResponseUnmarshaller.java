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

import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceParametersResponse;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceParametersResponse.DataItem;
import com.aliyuncs.cloud_siem.model.v20220616.DescribeDataSourceParametersResponse.DataItem.ParamValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDataSourceParametersResponseUnmarshaller {

	public static DescribeDataSourceParametersResponse unmarshall(DescribeDataSourceParametersResponse describeDataSourceParametersResponse, UnmarshallerContext _ctx) {
		
		describeDataSourceParametersResponse.setRequestId(_ctx.stringValue("DescribeDataSourceParametersResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDataSourceParametersResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setDataSourceType(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].DataSourceType"));
			dataItem.setParaLevel(_ctx.integerValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParaLevel"));
			dataItem.setParaCode(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParaCode"));
			dataItem.setParaName(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParaName"));
			dataItem.setParaType(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParaType"));
			dataItem.setRequired(_ctx.integerValue("DescribeDataSourceParametersResponse.Data["+ i +"].Required"));
			dataItem.setFormatCheck(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].FormatCheck"));
			dataItem.setTitle(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].Title"));
			dataItem.setHit(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].Hit"));
			dataItem.setDefaultValue(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].DefaultValue"));
			dataItem.setDisabled(_ctx.booleanValue("DescribeDataSourceParametersResponse.Data["+ i +"].Disabled"));
			dataItem.setCanEditted(_ctx.integerValue("DescribeDataSourceParametersResponse.Data["+ i +"].CanEditted"));
			dataItem.setCloudCode(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].CloudCode"));

			List<ParamValueItem> paramValue = new ArrayList<ParamValueItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParamValue.Length"); j++) {
				ParamValueItem paramValueItem = new ParamValueItem();
				paramValueItem.setLabel(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParamValue["+ j +"].Label"));
				paramValueItem.setValue(_ctx.stringValue("DescribeDataSourceParametersResponse.Data["+ i +"].ParamValue["+ j +"].Value"));

				paramValue.add(paramValueItem);
			}
			dataItem.setParamValue(paramValue);

			data.add(dataItem);
		}
		describeDataSourceParametersResponse.setData(data);
	 
	 	return describeDataSourceParametersResponse;
	}
}