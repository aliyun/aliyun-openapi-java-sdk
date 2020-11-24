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

import com.aliyuncs.ddoscoo.model.v20200101.DescribeAutoCcWhitelistResponse;
import com.aliyuncs.ddoscoo.model.v20200101.DescribeAutoCcWhitelistResponse.AutoCcWhitelistItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoCcWhitelistResponseUnmarshaller {

	public static DescribeAutoCcWhitelistResponse unmarshall(DescribeAutoCcWhitelistResponse describeAutoCcWhitelistResponse, UnmarshallerContext _ctx) {
		
		describeAutoCcWhitelistResponse.setRequestId(_ctx.stringValue("DescribeAutoCcWhitelistResponse.RequestId"));
		describeAutoCcWhitelistResponse.setTotalCount(_ctx.longValue("DescribeAutoCcWhitelistResponse.TotalCount"));

		List<AutoCcWhitelistItem> autoCcWhitelist = new ArrayList<AutoCcWhitelistItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAutoCcWhitelistResponse.AutoCcWhitelist.Length"); i++) {
			AutoCcWhitelistItem autoCcWhitelistItem = new AutoCcWhitelistItem();
			autoCcWhitelistItem.setDestIp(_ctx.stringValue("DescribeAutoCcWhitelistResponse.AutoCcWhitelist["+ i +"].DestIp"));
			autoCcWhitelistItem.setSourceIp(_ctx.stringValue("DescribeAutoCcWhitelistResponse.AutoCcWhitelist["+ i +"].SourceIp"));
			autoCcWhitelistItem.setEndTime(_ctx.longValue("DescribeAutoCcWhitelistResponse.AutoCcWhitelist["+ i +"].EndTime"));
			autoCcWhitelistItem.setType(_ctx.stringValue("DescribeAutoCcWhitelistResponse.AutoCcWhitelist["+ i +"].Type"));

			autoCcWhitelist.add(autoCcWhitelistItem);
		}
		describeAutoCcWhitelistResponse.setAutoCcWhitelist(autoCcWhitelist);
	 
	 	return describeAutoCcWhitelistResponse;
	}
}