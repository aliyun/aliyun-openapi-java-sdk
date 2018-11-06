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

package com.aliyuncs.aegis.transform.v20161111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.aegis.model.v20161111.DescribeWebshellResponse;
import com.aliyuncs.aegis.model.v20161111.DescribeWebshellResponse.WebshellListItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeWebshellResponseUnmarshaller {

	public static DescribeWebshellResponse unmarshall(DescribeWebshellResponse describeWebshellResponse, UnmarshallerContext context) {
		
		describeWebshellResponse.setRequestId(context.stringValue("DescribeWebshellResponse.RequestId"));

		List<WebshellListItem> webshellList = new ArrayList<WebshellListItem>();
		for (int i = 0; i < context.lengthValue("DescribeWebshellResponse.WebshellList.Length"); i++) {
			WebshellListItem webshellListItem = new WebshellListItem();
			webshellListItem.setOs(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].Os"));
			webshellListItem.setInstanceName(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].InstanceName"));
			webshellListItem.setGroupId(context.longValue("DescribeWebshellResponse.WebshellList["+ i +"].GroupId"));
			webshellListItem.setIp(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].Ip"));
			webshellListItem.setUuid(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].Uuid"));
			webshellListItem.setFoundTime(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].FoundTime"));
			webshellListItem.setInstanceId(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].InstanceId"));
			webshellListItem.setTrojanType(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].TrojanType"));
			webshellListItem.setFirstFoundTime(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].FirstFoundTime"));
			webshellListItem.setTrojanSize(context.longValue("DescribeWebshellResponse.WebshellList["+ i +"].TrojanSize"));
			webshellListItem.setDomain(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].Domain"));
			webshellListItem.setTrojanPath(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].TrojanPath"));
			webshellListItem.setRegion(context.stringValue("DescribeWebshellResponse.WebshellList["+ i +"].Region"));
			webshellListItem.setStatus(context.integerValue("DescribeWebshellResponse.WebshellList["+ i +"].Status"));

			webshellList.add(webshellListItem);
		}
		describeWebshellResponse.setWebshellList(webshellList);
	 
	 	return describeWebshellResponse;
	}
}