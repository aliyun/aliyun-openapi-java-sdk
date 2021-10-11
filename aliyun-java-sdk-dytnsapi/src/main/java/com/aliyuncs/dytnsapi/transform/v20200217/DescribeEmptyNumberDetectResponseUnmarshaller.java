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

package com.aliyuncs.dytnsapi.transform.v20200217;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dytnsapi.model.v20200217.DescribeEmptyNumberDetectResponse;
import com.aliyuncs.dytnsapi.model.v20200217.DescribeEmptyNumberDetectResponse.DataList;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeEmptyNumberDetectResponseUnmarshaller {

	public static DescribeEmptyNumberDetectResponse unmarshall(DescribeEmptyNumberDetectResponse describeEmptyNumberDetectResponse, UnmarshallerContext _ctx) {
		
		describeEmptyNumberDetectResponse.setRequestId(_ctx.stringValue("DescribeEmptyNumberDetectResponse.RequestId"));
		describeEmptyNumberDetectResponse.setCode(_ctx.stringValue("DescribeEmptyNumberDetectResponse.Code"));
		describeEmptyNumberDetectResponse.setMessage(_ctx.stringValue("DescribeEmptyNumberDetectResponse.Message"));

		List<DataList> data = new ArrayList<DataList>();
		for (int i = 0; i < _ctx.lengthValue("DescribeEmptyNumberDetectResponse.Data.Length"); i++) {
			DataList dataList = new DataList();
			dataList.setNumber(_ctx.stringValue("DescribeEmptyNumberDetectResponse.Data["+ i +"].Number"));
			dataList.setStatus(_ctx.stringValue("DescribeEmptyNumberDetectResponse.Data["+ i +"].Status"));

			data.add(dataList);
		}
		describeEmptyNumberDetectResponse.setData(data);
	 
	 	return describeEmptyNumberDetectResponse;
	}
}