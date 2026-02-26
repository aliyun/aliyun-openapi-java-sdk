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

package com.aliyuncs.eds_aic.transform.v20230930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eds_aic.model.v20230930.DescribeKeyPairsResponse;
import com.aliyuncs.eds_aic.model.v20230930.DescribeKeyPairsResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeKeyPairsResponseUnmarshaller {

	public static DescribeKeyPairsResponse unmarshall(DescribeKeyPairsResponse describeKeyPairsResponse, UnmarshallerContext _ctx) {
		
		describeKeyPairsResponse.setRequestId(_ctx.stringValue("DescribeKeyPairsResponse.RequestId"));
		describeKeyPairsResponse.setNextToken(_ctx.stringValue("DescribeKeyPairsResponse.NextToken"));
		describeKeyPairsResponse.setTotalCount(_ctx.integerValue("DescribeKeyPairsResponse.TotalCount"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeKeyPairsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKeyPairId(_ctx.stringValue("DescribeKeyPairsResponse.Data["+ i +"].KeyPairId"));
			dataItem.setKeyPairName(_ctx.stringValue("DescribeKeyPairsResponse.Data["+ i +"].KeyPairName"));
			dataItem.setGmtCreated(_ctx.stringValue("DescribeKeyPairsResponse.Data["+ i +"].GmtCreated"));

			data.add(dataItem);
		}
		describeKeyPairsResponse.setData(data);
	 
	 	return describeKeyPairsResponse;
	}
}