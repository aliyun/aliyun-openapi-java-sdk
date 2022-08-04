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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.ListTrademarkSbjKeyResponse;
import com.aliyuncs.trademark.model.v20180724.ListTrademarkSbjKeyResponse.TmSbjKeyInfoItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTrademarkSbjKeyResponseUnmarshaller {

	public static ListTrademarkSbjKeyResponse unmarshall(ListTrademarkSbjKeyResponse listTrademarkSbjKeyResponse, UnmarshallerContext _ctx) {
		
		listTrademarkSbjKeyResponse.setRequestId(_ctx.stringValue("ListTrademarkSbjKeyResponse.RequestId"));

		List<TmSbjKeyInfoItem> tmSbjKeyInfo = new ArrayList<TmSbjKeyInfoItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo.Length"); i++) {
			TmSbjKeyInfoItem tmSbjKeyInfoItem = new TmSbjKeyInfoItem();
			tmSbjKeyInfoItem.setTypeCert(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].TypeCert"));
			tmSbjKeyInfoItem.setKeyType(_ctx.integerValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].KeyType"));
			tmSbjKeyInfoItem.setSignData(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].SignData"));
			tmSbjKeyInfoItem.setAgentId(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].AgentId"));
			tmSbjKeyInfoItem.setSignCert(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].SignCert"));
			tmSbjKeyInfoItem.setSubmitSignData(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].SubmitSignData"));
			tmSbjKeyInfoItem.setValidDate(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].ValidDate"));
			tmSbjKeyInfoItem.setClearData(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].ClearData"));
			tmSbjKeyInfoItem.setPin(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].Pin"));
			tmSbjKeyInfoItem.setHashData(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].HashData"));
			tmSbjKeyInfoItem.setPrincipalName(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].PrincipalName"));
			tmSbjKeyInfoItem.setTmurl(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].tmurl"));
			tmSbjKeyInfoItem.setName(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].Name"));
			tmSbjKeyInfoItem.setStartValidDate(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].StartValidDate"));
			tmSbjKeyInfoItem.setAgreeProt(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].AgreeProt"));
			tmSbjKeyInfoItem.setPrincipalKey(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].PrincipalKey"));
			tmSbjKeyInfoItem.setUsername(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].Username"));
			tmSbjKeyInfoItem.setCertInfo(_ctx.stringValue("ListTrademarkSbjKeyResponse.TmSbjKeyInfo["+ i +"].CertInfo"));

			tmSbjKeyInfo.add(tmSbjKeyInfoItem);
		}
		listTrademarkSbjKeyResponse.setTmSbjKeyInfo(tmSbjKeyInfo);
	 
	 	return listTrademarkSbjKeyResponse;
	}
}