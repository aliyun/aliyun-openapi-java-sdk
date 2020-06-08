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

package com.aliyuncs.geoip.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceDataInfosResponse;
import com.aliyuncs.geoip.model.v20200101.DescribeGeoipInstanceDataInfosResponse.DataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeGeoipInstanceDataInfosResponseUnmarshaller {

	public static DescribeGeoipInstanceDataInfosResponse unmarshall(DescribeGeoipInstanceDataInfosResponse describeGeoipInstanceDataInfosResponse, UnmarshallerContext _ctx) {
		
		describeGeoipInstanceDataInfosResponse.setRequestId(_ctx.stringValue("DescribeGeoipInstanceDataInfosResponse.RequestId"));

		List<DataInfo> dataInfos = new ArrayList<DataInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeGeoipInstanceDataInfosResponse.DataInfos.Length"); i++) {
			DataInfo dataInfo = new DataInfo();
			dataInfo.setType(_ctx.stringValue("DescribeGeoipInstanceDataInfosResponse.DataInfos["+ i +"].Type"));
			dataInfo.setVersion(_ctx.stringValue("DescribeGeoipInstanceDataInfosResponse.DataInfos["+ i +"].Version"));
			dataInfo.setUpdateTime(_ctx.stringValue("DescribeGeoipInstanceDataInfosResponse.DataInfos["+ i +"].UpdateTime"));
			dataInfo.setUpdateTimestamp(_ctx.longValue("DescribeGeoipInstanceDataInfosResponse.DataInfos["+ i +"].UpdateTimestamp"));
			dataInfo.setDownloadCount(_ctx.longValue("DescribeGeoipInstanceDataInfosResponse.DataInfos["+ i +"].DownloadCount"));

			dataInfos.add(dataInfo);
		}
		describeGeoipInstanceDataInfosResponse.setDataInfos(dataInfos);
	 
	 	return describeGeoipInstanceDataInfosResponse;
	}
}