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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeIMVInfosResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeIMVInfosResponse.ImvInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIMVInfosResponseUnmarshaller {

	public static DescribeIMVInfosResponse unmarshall(DescribeIMVInfosResponse describeIMVInfosResponse, UnmarshallerContext _ctx) {
		
		describeIMVInfosResponse.setRequestId(_ctx.stringValue("DescribeIMVInfosResponse.RequestId"));
		describeIMVInfosResponse.setDBInstanceId(_ctx.stringValue("DescribeIMVInfosResponse.DBInstanceId"));

		List<ImvInfo> imvInfos = new ArrayList<ImvInfo>();
		for (int i = 0; i < _ctx.lengthValue("DescribeIMVInfosResponse.ImvInfos.Length"); i++) {
			ImvInfo imvInfo = new ImvInfo();
			imvInfo.setMV(_ctx.stringValue("DescribeIMVInfosResponse.ImvInfos["+ i +"].MV"));
			imvInfo.setBase(_ctx.stringValue("DescribeIMVInfosResponse.ImvInfos["+ i +"].Base"));
			imvInfo.setDetailInfo(_ctx.stringValue("DescribeIMVInfosResponse.ImvInfos["+ i +"].DetailInfo"));

			imvInfos.add(imvInfo);
		}
		describeIMVInfosResponse.setImvInfos(imvInfos);
	 
	 	return describeIMVInfosResponse;
	}
}