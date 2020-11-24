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

package com.aliyuncs.ddoscoo.transform.v20200101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ddoscoo.model.v20200101.DescribeAutoCcBlacklistResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeAutoCcBlacklistResponse.AutoCcBlacklistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoCcBlacklistResponseUnmarshaller {

	public static DescribeAutoCcBlacklistResponse unmarshall(DescribeAutoCcBlacklistResponse describeAutoCcBlacklistResponse, UnmarshallerContext _ctx) {
		
		describeAutoCcBlacklistResponse.setRequestId(_ctx.stringValue("DescribeAutoCcBlacklistResponse.RequestId"));
		describeAutoCcBlacklistResponse.setTotalCount(_ctx.longValue("DescribeAutoCcBlacklistResponse.TotalCount"));

		List<AutoCcBlacklistItem> autoCcBlacklist = new ArrayList<AutoCcBlacklistItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoCcBlacklistResponse.AutoCcBlacklist.Length"); i++) {
			AutoCcBlacklistItem autoCcBlacklistItem = new AutoCcBlacklistItem();
			autoCcBlacklistItem.setDestIp(_ctx.stringValue("DescribeAutoCcBlacklistResponse.AutoCcBlacklist["+ i +"].DestIp"));
			autoCcBlacklistItem.setSourceIp(_ctx.stringValue("DescribeAutoCcBlacklistResponse.AutoCcBlacklist["+ i +"].SourceIp"));
			autoCcBlacklistItem.setEndTime(_ctx.longValue("DescribeAutoCcBlacklistResponse.AutoCcBlacklist["+ i +"].EndTime"));
			autoCcBlacklistItem.setType(_ctx.stringValue("DescribeAutoCcBlacklistResponse.AutoCcBlacklist["+ i +"].Type"));

			autoCcBlacklist.add(autoCcBlacklistItem);
		}
		describeAutoCcBlacklistResponse.setAutoCcBlacklist(autoCcBlacklist);
	 
	 	return describeAutoCcBlacklistResponse;
	}
}