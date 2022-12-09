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

package com.aliyuncs.ga.transform.v20191120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ga.model.v20191120.ListBasicAccelerateIpsResponse;
import com.aliyuncs.ga.model.v20191120.ListBasicAccelerateIpsResponse.AccelerateIpsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBasicAccelerateIpsResponseUnmarshaller {

	public static ListBasicAccelerateIpsResponse unmarshall(ListBasicAccelerateIpsResponse listBasicAccelerateIpsResponse, UnmarshallerContext _ctx) {
		
		listBasicAccelerateIpsResponse.setRequestId(_ctx.stringValue("ListBasicAccelerateIpsResponse.RequestId"));
		listBasicAccelerateIpsResponse.setTotalCount(_ctx.integerValue("ListBasicAccelerateIpsResponse.TotalCount"));
		listBasicAccelerateIpsResponse.setNextToken(_ctx.stringValue("ListBasicAccelerateIpsResponse.NextToken"));
		listBasicAccelerateIpsResponse.setMaxResults(_ctx.integerValue("ListBasicAccelerateIpsResponse.MaxResults"));

		List<AccelerateIpsItem> accelerateIps = new ArrayList<AccelerateIpsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBasicAccelerateIpsResponse.AccelerateIps.Length"); i++) {
			AccelerateIpsItem accelerateIpsItem = new AccelerateIpsItem();
			accelerateIpsItem.setAcceleratorId(_ctx.stringValue("ListBasicAccelerateIpsResponse.AccelerateIps["+ i +"].AcceleratorId"));
			accelerateIpsItem.setIpSetId(_ctx.stringValue("ListBasicAccelerateIpsResponse.AccelerateIps["+ i +"].IpSetId"));
			accelerateIpsItem.setAccelerateIpId(_ctx.stringValue("ListBasicAccelerateIpsResponse.AccelerateIps["+ i +"].AccelerateIpId"));
			accelerateIpsItem.setAccelerateIpAddress(_ctx.stringValue("ListBasicAccelerateIpsResponse.AccelerateIps["+ i +"].AccelerateIpAddress"));
			accelerateIpsItem.setState(_ctx.stringValue("ListBasicAccelerateIpsResponse.AccelerateIps["+ i +"].State"));

			accelerateIps.add(accelerateIpsItem);
		}
		listBasicAccelerateIpsResponse.setAccelerateIps(accelerateIps);
	 
	 	return listBasicAccelerateIpsResponse;
	}
}