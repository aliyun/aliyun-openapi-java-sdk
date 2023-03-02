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

package com.aliyuncs.lto.transform.v20210707;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lto.model.v20210707.ListBizChainDataResponse;
import com.aliyuncs.lto.model.v20210707.ListBizChainDataResponse.Data;
import com.aliyuncs.lto.model.v20210707.ListBizChainDataResponse.Data.BizChainDataInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBizChainDataResponseUnmarshaller {

	public static ListBizChainDataResponse unmarshall(ListBizChainDataResponse listBizChainDataResponse, UnmarshallerContext _ctx) {
		
		listBizChainDataResponse.setRequestId(_ctx.stringValue("ListBizChainDataResponse.RequestId"));
		listBizChainDataResponse.setCode(_ctx.stringValue("ListBizChainDataResponse.Code"));
		listBizChainDataResponse.setHttpStatusCode(_ctx.integerValue("ListBizChainDataResponse.HttpStatusCode"));
		listBizChainDataResponse.setMessage(_ctx.stringValue("ListBizChainDataResponse.Message"));
		listBizChainDataResponse.setSuccess(_ctx.booleanValue("ListBizChainDataResponse.Success"));

		Data data = new Data();
		data.setNum(_ctx.integerValue("ListBizChainDataResponse.Data.Num"));
		data.setTotal(_ctx.integerValue("ListBizChainDataResponse.Data.Total"));
		data.setSize(_ctx.integerValue("ListBizChainDataResponse.Data.Size"));

		List<BizChainDataInfo> pageData = new ArrayList<BizChainDataInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListBizChainDataResponse.Data.PageData.Length"); i++) {
			BizChainDataInfo bizChainDataInfo = new BizChainDataInfo();
			bizChainDataInfo.setBlockNum(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].BlockNum"));
			bizChainDataInfo.setProductKey(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].ProductKey"));
			bizChainDataInfo.setMemberName(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].MemberName"));
			bizChainDataInfo.setDeviceName(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].DeviceName"));
			bizChainDataInfo.setBlockHash(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].BlockHash"));
			bizChainDataInfo.setTxHash(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].TxHash"));
			bizChainDataInfo.setTimestamp(_ctx.longValue("ListBizChainDataResponse.Data.PageData["+ i +"].Timestamp"));
			bizChainDataInfo.setIotDataDID(_ctx.stringValue("ListBizChainDataResponse.Data.PageData["+ i +"].IotDataDID"));

			pageData.add(bizChainDataInfo);
		}
		data.setPageData(pageData);
		listBizChainDataResponse.setData(data);
	 
	 	return listBizChainDataResponse;
	}
}