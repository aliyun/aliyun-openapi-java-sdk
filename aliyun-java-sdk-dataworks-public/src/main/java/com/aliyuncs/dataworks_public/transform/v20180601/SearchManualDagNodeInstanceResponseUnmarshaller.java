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

package com.aliyuncs.dataworks_public.transform.v20180601;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20180601.SearchManualDagNodeInstanceResponse;
import com.aliyuncs.dataworks_public.model.v20180601.SearchManualDagNodeInstanceResponse.NodeInsInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchManualDagNodeInstanceResponseUnmarshaller {

	public static SearchManualDagNodeInstanceResponse unmarshall(SearchManualDagNodeInstanceResponse searchManualDagNodeInstanceResponse, UnmarshallerContext _ctx) {
		
		searchManualDagNodeInstanceResponse.setRequestId(_ctx.stringValue("SearchManualDagNodeInstanceResponse.RequestId"));
		searchManualDagNodeInstanceResponse.setErrCode(_ctx.stringValue("SearchManualDagNodeInstanceResponse.ErrCode"));
		searchManualDagNodeInstanceResponse.setErrMsg(_ctx.stringValue("SearchManualDagNodeInstanceResponse.ErrMsg"));
		searchManualDagNodeInstanceResponse.setSuccess(_ctx.booleanValue("SearchManualDagNodeInstanceResponse.Success"));

		List<NodeInsInfo> data = new ArrayList<NodeInsInfo>();
		for (int i = 0; i < _ctx.lengthValue("SearchManualDagNodeInstanceResponse.Data.Length"); i++) {
			NodeInsInfo nodeInsInfo = new NodeInsInfo();
			nodeInsInfo.setInstanceId(_ctx.longValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].InstanceId"));
			nodeInsInfo.setDagId(_ctx.longValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].DagId"));
			nodeInsInfo.setDagType(_ctx.integerValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].DagType"));
			nodeInsInfo.setStatus(_ctx.integerValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].Status"));
			nodeInsInfo.setBizdate(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].Bizdate"));
			nodeInsInfo.setParaValue(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].ParaValue"));
			nodeInsInfo.setFinishTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].FinishTime"));
			nodeInsInfo.setBeginWaitTimeTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginWaitTimeTime"));
			nodeInsInfo.setBeginWaitResTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginWaitResTime"));
			nodeInsInfo.setBeginRunningTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].BeginRunningTime"));
			nodeInsInfo.setCreateTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].CreateTime"));
			nodeInsInfo.setModifyTime(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].ModifyTime"));
			nodeInsInfo.setNodeName(_ctx.stringValue("SearchManualDagNodeInstanceResponse.Data["+ i +"].NodeName"));

			data.add(nodeInsInfo);
		}
		searchManualDagNodeInstanceResponse.setData(data);
	 
	 	return searchManualDagNodeInstanceResponse;
	}
}