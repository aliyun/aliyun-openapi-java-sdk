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

package com.aliyuncs.linkcard.transform.v20210520;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkcard.model.v20210520.ListCardInfoResponse;
import com.aliyuncs.linkcard.model.v20210520.ListCardInfoResponse.Data;
import com.aliyuncs.linkcard.model.v20210520.ListCardInfoResponse.Data.CardDTO;
import com.aliyuncs.linkcard.model.v20210520.ListCardInfoResponse.Data.CardDTO.TagListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCardInfoResponseUnmarshaller {

	public static ListCardInfoResponse unmarshall(ListCardInfoResponse listCardInfoResponse, UnmarshallerContext _ctx) {
		
		listCardInfoResponse.setRequestId(_ctx.stringValue("ListCardInfoResponse.RequestId"));
		listCardInfoResponse.setCode(_ctx.stringValue("ListCardInfoResponse.Code"));
		listCardInfoResponse.setErrorMessage(_ctx.stringValue("ListCardInfoResponse.ErrorMessage"));
		listCardInfoResponse.setSuccess(_ctx.booleanValue("ListCardInfoResponse.Success"));
		listCardInfoResponse.setLocalizedMessage(_ctx.stringValue("ListCardInfoResponse.LocalizedMessage"));

		Data data = new Data();
		data.setPageNo(_ctx.integerValue("ListCardInfoResponse.Data.PageNo"));
		data.setPageSize(_ctx.integerValue("ListCardInfoResponse.Data.PageSize"));
		data.setPageCount(_ctx.integerValue("ListCardInfoResponse.Data.PageCount"));
		data.setTotal(_ctx.integerValue("ListCardInfoResponse.Data.Total"));

		List<CardDTO> list = new ArrayList<CardDTO>();
		for (int i = 0; i < _ctx.lengthValue("ListCardInfoResponse.Data.List.Length"); i++) {
			CardDTO cardDTO = new CardDTO();
			cardDTO.setStatus(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Status"));
			cardDTO.setDataType(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].DataType"));
			cardDTO.setDirectionalGroupName(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].DirectionalGroupName"));
			cardDTO.setPeriodRestFlow(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].PeriodRestFlow"));
			cardDTO.setCredentialType(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].CredentialType"));
			cardDTO.setPeriodAddFlow(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].PeriodAddFlow"));
			cardDTO.setPeriodSmsUse(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].PeriodSmsUse"));
			cardDTO.setDataLevel(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].DataLevel"));
			cardDTO.setOsStatus(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].OsStatus"));
			cardDTO.setNotifyId(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].NotifyId"));
			cardDTO.setAliFee(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].AliFee"));
			cardDTO.setAliyunOrderId(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].AliyunOrderId"));
			cardDTO.setActiveType(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].ActiveType"));
			cardDTO.setIsAutoRecharge(_ctx.booleanValue("ListCardInfoResponse.Data.List["+ i +"].IsAutoRecharge"));
			cardDTO.setCredentialInstanceId(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].CredentialInstanceId"));
			cardDTO.setExpireTime(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].ExpireTime"));
			cardDTO.setApnName(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].ApnName"));
			cardDTO.setActiveTime(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].ActiveTime"));
			cardDTO.setIccid(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Iccid"));
			cardDTO.setVendor(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Vendor"));
			cardDTO.setPeriod(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Period"));
			cardDTO.setCertifyType(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].CertifyType"));
			cardDTO.setPrivateNetworkSegment(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].PrivateNetworkSegment"));
			cardDTO.setOpenAccountTime(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].OpenAccountTime"));
			cardDTO.setSimType(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].SimType"));
			cardDTO.setVsimInstanceId(_ctx.longValue("ListCardInfoResponse.Data.List["+ i +"].VsimInstanceId"));
			cardDTO.setCredentialNo(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].CredentialNo"));
			cardDTO.setRemark(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Remark"));
			cardDTO.setDirectionalGroupId(_ctx.longValue("ListCardInfoResponse.Data.List["+ i +"].DirectionalGroupId"));

			List<String> imsi = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCardInfoResponse.Data.List["+ i +"].Imsi.Length"); j++) {
				imsi.add(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Imsi["+ j +"]"));
			}
			cardDTO.setImsi(imsi);

			List<String> msisdn = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListCardInfoResponse.Data.List["+ i +"].Msisdn.Length"); j++) {
				msisdn.add(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].Msisdn["+ j +"]"));
			}
			cardDTO.setMsisdn(msisdn);

			List<TagListItem> tagList = new ArrayList<TagListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCardInfoResponse.Data.List["+ i +"].TagList.Length"); j++) {
				TagListItem tagListItem = new TagListItem();
				tagListItem.setTagName(_ctx.stringValue("ListCardInfoResponse.Data.List["+ i +"].TagList["+ j +"].TagName"));
				tagListItem.setId(_ctx.longValue("ListCardInfoResponse.Data.List["+ i +"].TagList["+ j +"].Id"));

				tagList.add(tagListItem);
			}
			cardDTO.setTagList(tagList);

			list.add(cardDTO);
		}
		data.setList(list);
		listCardInfoResponse.setData(data);
	 
	 	return listCardInfoResponse;
	}
}