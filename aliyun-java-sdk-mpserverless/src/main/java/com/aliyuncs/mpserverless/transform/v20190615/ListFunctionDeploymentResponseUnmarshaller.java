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

package com.aliyuncs.mpserverless.transform.v20190615;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mpserverless.model.v20190615.ListFunctionDeploymentResponse;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionDeploymentResponse.DataListItem;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionDeploymentResponse.DataListItem.Status;
import com.aliyuncs.mpserverless.model.v20190615.ListFunctionDeploymentResponse.Paginator;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionDeploymentResponseUnmarshaller {

	public static ListFunctionDeploymentResponse unmarshall(ListFunctionDeploymentResponse listFunctionDeploymentResponse, UnmarshallerContext _ctx) {
		
		listFunctionDeploymentResponse.setRequestId(_ctx.stringValue("ListFunctionDeploymentResponse.RequestId"));
		listFunctionDeploymentResponse.setHttpStatusCode(_ctx.stringValue("ListFunctionDeploymentResponse.HttpStatusCode"));
		listFunctionDeploymentResponse.setSuccess(_ctx.booleanValue("ListFunctionDeploymentResponse.Success"));
		listFunctionDeploymentResponse.setCode(_ctx.stringValue("ListFunctionDeploymentResponse.Code"));
		listFunctionDeploymentResponse.setMessage(_ctx.stringValue("ListFunctionDeploymentResponse.Message"));

		Paginator paginator = new Paginator();
		paginator.setPageSize(_ctx.integerValue("ListFunctionDeploymentResponse.Paginator.PageSize"));
		paginator.setPageNum(_ctx.integerValue("ListFunctionDeploymentResponse.Paginator.PageNum"));
		paginator.setTotal(_ctx.integerValue("ListFunctionDeploymentResponse.Paginator.Total"));
		paginator.setPageCount(_ctx.integerValue("ListFunctionDeploymentResponse.Paginator.PageCount"));
		listFunctionDeploymentResponse.setPaginator(paginator);

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionDeploymentResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setDeploymentId(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].DeploymentId"));
			dataListItem.setVersionNo(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].VersionNo"));
			dataListItem.setCreatedAt(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].CreatedAt"));
			dataListItem.setModifiedAt(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].ModifiedAt"));
			dataListItem.setDownloadSignedUrl(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].DownloadSignedUrl"));

			Status status = new Status();
			status.setMessage(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].Status.Message"));
			status.setStatus(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].Status.Status"));
			status.setLabel(_ctx.stringValue("ListFunctionDeploymentResponse.DataList["+ i +"].Status.Label"));
			dataListItem.setStatus(status);

			dataList.add(dataListItem);
		}
		listFunctionDeploymentResponse.setDataList(dataList);
	 
	 	return listFunctionDeploymentResponse;
	}
}