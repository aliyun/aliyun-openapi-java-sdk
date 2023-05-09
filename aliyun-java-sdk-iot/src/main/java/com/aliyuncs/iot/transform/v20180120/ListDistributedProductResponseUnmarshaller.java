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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.ListDistributedProductResponse;
import com.aliyuncs.iot.model.v20180120.ListDistributedProductResponse.Data;
import com.aliyuncs.iot.model.v20180120.ListDistributedProductResponse.Data.Items;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDistributedProductResponseUnmarshaller {

	public static ListDistributedProductResponse unmarshall(ListDistributedProductResponse listDistributedProductResponse, UnmarshallerContext _ctx) {
		
		listDistributedProductResponse.setRequestId(_ctx.stringValue("ListDistributedProductResponse.RequestId"));
		listDistributedProductResponse.setCode(_ctx.stringValue("ListDistributedProductResponse.Code"));
		listDistributedProductResponse.setErrorMessage(_ctx.stringValue("ListDistributedProductResponse.ErrorMessage"));
		listDistributedProductResponse.setSuccess(_ctx.booleanValue("ListDistributedProductResponse.Success"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListDistributedProductResponse.Data.Total"));

		List<Items> info = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("ListDistributedProductResponse.Data.Info.Length"); i++) {
			Items items = new Items();
			items.setTargetRegion(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].TargetRegion"));
			items.setProductKey(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].ProductKey"));
			items.setTargetUid(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].TargetUid"));
			items.setTargetInstanceName(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].TargetInstanceName"));
			items.setTargetAliyunId(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].TargetAliyunId"));
			items.setGmtCreate(_ctx.longValue("ListDistributedProductResponse.Data.Info["+ i +"].GmtCreate"));
			items.setSourceInstanceName(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].SourceInstanceName"));
			items.setSourceUid(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].SourceUid"));
			items.setTargetInstanceId(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].TargetInstanceId"));
			items.setSourceRegion(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].SourceRegion"));
			items.setSourceInstanceId(_ctx.stringValue("ListDistributedProductResponse.Data.Info["+ i +"].SourceInstanceId"));

			info.add(items);
		}
		data.setInfo(info);
		listDistributedProductResponse.setData(data);
	 
	 	return listDistributedProductResponse;
	}
}