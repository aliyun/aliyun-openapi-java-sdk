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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.GetClusterQueueInfoByEnvResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetClusterQueueInfoByEnvResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetClusterQueueInfoByEnvResponseUnmarshaller {

	public static GetClusterQueueInfoByEnvResponse unmarshall(GetClusterQueueInfoByEnvResponse getClusterQueueInfoByEnvResponse, UnmarshallerContext _ctx) {
		
		getClusterQueueInfoByEnvResponse.setRequestId(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.RequestId"));
		getClusterQueueInfoByEnvResponse.setSuccess(_ctx.booleanValue("GetClusterQueueInfoByEnvResponse.Success"));
		getClusterQueueInfoByEnvResponse.setHttpStatusCode(_ctx.integerValue("GetClusterQueueInfoByEnvResponse.HttpStatusCode"));
		getClusterQueueInfoByEnvResponse.setCode(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Code"));
		getClusterQueueInfoByEnvResponse.setMessage(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Message"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetClusterQueueInfoByEnvResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setClusterId(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].ClusterId"));
			dataItem.setQueueName(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].QueueName"));
			dataItem.setMaxVcore(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].MaxVcore"));
			dataItem.setNamespace(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].Namespace"));
			dataItem.setCreateAt(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].CreateAt"));
			dataItem.setModifiedAt(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].ModifiedAt"));
			dataItem.setAnnotations(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].Annotations"));
			dataItem.setLabels(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].Labels"));
			dataItem.setResourceVersion(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].ResourceVersion"));
			dataItem.setSpec(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].Spec"));
			dataItem.setVvpClusterType(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].VvpClusterType"));
			dataItem.setFlinkVersion(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].FlinkVersion"));
			dataItem.setFlinkImageRegistry(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].FlinkImageRegistry"));
			dataItem.setFlinkImageRepository(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].FlinkImageRepository"));
			dataItem.setFlinkImageTag(_ctx.stringValue("GetClusterQueueInfoByEnvResponse.Data["+ i +"].FlinkImageTag"));

			data.add(dataItem);
		}
		getClusterQueueInfoByEnvResponse.setData(data);
	 
	 	return getClusterQueueInfoByEnvResponse;
	}
}