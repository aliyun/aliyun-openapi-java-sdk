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

package com.aliyuncs.cms.transform.v20190101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cms.model.v20190101.DescribeExporterOutputListResponse;
import com.aliyuncs.cms.model.v20190101.DescribeExporterOutputListResponse.Datapoint;
import com.aliyuncs.cms.model.v20190101.DescribeExporterOutputListResponse.Datapoint.ConfigJson;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeExporterOutputListResponseUnmarshaller {

	public static DescribeExporterOutputListResponse unmarshall(DescribeExporterOutputListResponse describeExporterOutputListResponse, UnmarshallerContext _ctx) {
		
		describeExporterOutputListResponse.setRequestId(_ctx.stringValue("DescribeExporterOutputListResponse.RequestId"));
		describeExporterOutputListResponse.setCode(_ctx.stringValue("DescribeExporterOutputListResponse.Code"));
		describeExporterOutputListResponse.setMessage(_ctx.stringValue("DescribeExporterOutputListResponse.Message"));
		describeExporterOutputListResponse.setTotal(_ctx.integerValue("DescribeExporterOutputListResponse.Total"));
		describeExporterOutputListResponse.setPageNumber(_ctx.integerValue("DescribeExporterOutputListResponse.PageNumber"));
		describeExporterOutputListResponse.setSuccess(_ctx.booleanValue("DescribeExporterOutputListResponse.Success"));

		List<Datapoint> datapoints = new ArrayList<Datapoint>();
		for (int i = 0; i < _ctx.lengthValue("DescribeExporterOutputListResponse.Datapoints.Length"); i++) {
			Datapoint datapoint = new Datapoint();
			datapoint.setDestName(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].DestName"));
			datapoint.setDestType(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].DestType"));
			datapoint.setCreateTime(_ctx.longValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].CreateTime"));

			ConfigJson configJson = new ConfigJson();
			configJson.setLogstore(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].ConfigJson.logstore"));
			configJson.setProject(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].ConfigJson.project"));
			configJson.setEndpoint(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].ConfigJson.endpoint"));
			configJson.setAs(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].ConfigJson.as"));
			configJson.setAk(_ctx.stringValue("DescribeExporterOutputListResponse.Datapoints["+ i +"].ConfigJson.ak"));
			datapoint.setConfigJson(configJson);

			datapoints.add(datapoint);
		}
		describeExporterOutputListResponse.setDatapoints(datapoints);
	 
	 	return describeExporterOutputListResponse;
	}
}