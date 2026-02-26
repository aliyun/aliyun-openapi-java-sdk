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

package com.aliyuncs.brinekingdom.transform.v20190627;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.brinekingdom.model.v20190627.TrackResponse;
import com.aliyuncs.brinekingdom.model.v20190627.TrackResponse.DataListItem;
import com.aliyuncs.brinekingdom.model.v20190627.TrackResponse.DataListItem.ProgressListItem;
import com.aliyuncs.brinekingdom.model.v20190627.TrackResponse.DataListItem.ProgressListItem.DeliveryInfoListItem;
import com.aliyuncs.brinekingdom.model.v20190627.TrackResponse.DataListItem.ProgressListItem.FcstDeliveryListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class TrackResponseUnmarshaller {

	public static TrackResponse unmarshall(TrackResponse trackResponse, UnmarshallerContext _ctx) {
		
		trackResponse.setRequestId(_ctx.stringValue("TrackResponse.RequestId"));
		trackResponse.setMessage(_ctx.stringValue("TrackResponse.Message"));
		trackResponse.setSuccess(_ctx.booleanValue("TrackResponse.Success"));

		List<DataListItem> dataList = new ArrayList<DataListItem>();
		for (int i = 0; i < _ctx.lengthValue("TrackResponse.DataList.Length"); i++) {
			DataListItem dataListItem = new DataListItem();
			dataListItem.setMoveQty(_ctx.integerValue("TrackResponse.DataList["+ i +"].MoveQty"));
			dataListItem.setSourceId(_ctx.stringValue("TrackResponse.DataList["+ i +"].SourceId"));
			dataListItem.setDemandId(_ctx.longValue("TrackResponse.DataList["+ i +"].DemandId"));
			dataListItem.setSupplyQty(_ctx.integerValue("TrackResponse.DataList["+ i +"].SupplyQty"));
			dataListItem.setExpectDate(_ctx.longValue("TrackResponse.DataList["+ i +"].ExpectDate"));
			dataListItem.setDemandStatus(_ctx.stringValue("TrackResponse.DataList["+ i +"].DemandStatus"));
			dataListItem.setSource(_ctx.stringValue("TrackResponse.DataList["+ i +"].Source"));

			List<ProgressListItem> progressList = new ArrayList<ProgressListItem>();
			for (int j = 0; j < _ctx.lengthValue("TrackResponse.DataList["+ i +"].ProgressList.Length"); j++) {
				ProgressListItem progressListItem = new ProgressListItem();
				progressListItem.setRealDeliveryDate(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].RealDeliveryDate"));
				progressListItem.setOrderErrorMsg(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].OrderErrorMsg"));
				progressListItem.setSlaDeliveryDate(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].SlaDeliveryDate"));
				progressListItem.setLadingCnt(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].LadingCnt"));
				progressListItem.setOrderNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].OrderNumber"));
				progressListItem.setExpectDate(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].ExpectDate"));
				progressListItem.setDealCnt(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DealCnt"));
				progressListItem.setDeliveryStatus(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryStatus"));
				progressListItem.setDeliveryCnt(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryCnt"));
				progressListItem.setRackStatus(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].RackStatus"));
				progressListItem.setDeliveryType(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryType"));

				List<FcstDeliveryListItem> fcstDeliveryList = new ArrayList<FcstDeliveryListItem>();
				for (int k = 0; k < _ctx.lengthValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].FcstDeliveryList.Length"); k++) {
					FcstDeliveryListItem fcstDeliveryListItem = new FcstDeliveryListItem();
					fcstDeliveryListItem.setFcstDeliveryDate(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].FcstDeliveryList["+ k +"].FcstDeliveryDate"));
					fcstDeliveryListItem.setFcstDeliveryCnt(_ctx.integerValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].FcstDeliveryList["+ k +"].FcstDeliveryCnt"));

					fcstDeliveryList.add(fcstDeliveryListItem);
				}
				progressListItem.setFcstDeliveryList(fcstDeliveryList);

				List<DeliveryInfoListItem> deliveryInfoList = new ArrayList<DeliveryInfoListItem>();
				for (int k = 0; k < _ctx.lengthValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList.Length"); k++) {
					DeliveryInfoListItem deliveryInfoListItem = new DeliveryInfoListItem();
					deliveryInfoListItem.setDeviceSource(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].DeviceSource"));
					deliveryInfoListItem.setBrandCode(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].BrandCode"));
					deliveryInfoListItem.setOrderNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].OrderNumber"));
					deliveryInfoListItem.setCreator(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].Creator"));
					deliveryInfoListItem.setLadingOrderTime(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].LadingOrderTime"));
					deliveryInfoListItem.setTransferTypeDES(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].TransferTypeDES"));
					deliveryInfoListItem.setSecurityDomain(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].SecurityDomain"));
					deliveryInfoListItem.setIdcName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].IdcName"));
					deliveryInfoListItem.setParentFactoryModelName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ParentFactoryModelName"));
					deliveryInfoListItem.setFinishTime(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].FinishTime"));
					deliveryInfoListItem.setReceiveType(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ReceiveType"));
					deliveryInfoListItem.setLoading(_ctx.integerValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].Loading"));
					deliveryInfoListItem.setLogicZone(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].LogicZone"));
					deliveryInfoListItem.setNetworkType(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].NetworkType"));
					deliveryInfoListItem.setLogicZoneName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].LogicZoneName"));
					deliveryInfoListItem.setTemplateName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].TemplateName"));
					deliveryInfoListItem.setKeepData(_ctx.booleanValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].KeepData"));
					deliveryInfoListItem.setModelName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ModelName"));
					deliveryInfoListItem.setRoomName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].RoomName"));
					deliveryInfoListItem.setTransferNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].TransferNumber"));
					deliveryInfoListItem.setBatchNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].BatchNumber"));
					deliveryInfoListItem.setPoNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].PoNumber"));
					deliveryInfoListItem.setOsName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].OsName"));
					deliveryInfoListItem.setErrorInfo(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ErrorInfo"));
					deliveryInfoListItem.setPrNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].PrNumber"));
					deliveryInfoListItem.setShipNumber(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ShipNumber"));
					deliveryInfoListItem.setInstallSwitch(_ctx.booleanValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].InstallSwitch"));
					deliveryInfoListItem.setBusinessLabel(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].BusinessLabel"));
					deliveryInfoListItem.setTransferType(_ctx.integerValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].TransferType"));
					deliveryInfoListItem.setProgressStepEnum(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].ProgressStepEnum"));
					deliveryInfoListItem.setPreInputTime(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].PreInputTime"));
					deliveryInfoListItem.setGmtCreate(_ctx.longValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].GmtCreate"));
					deliveryInfoListItem.setTransferName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].TransferName"));
					deliveryInfoListItem.setSourceAppGroup(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].SourceAppGroup"));
					deliveryInfoListItem.setSourceIdcName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].SourceIdcName"));
					deliveryInfoListItem.setRackName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].RackName"));
					deliveryInfoListItem.setSn(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].Sn"));
					deliveryInfoListItem.setAppGroupName(_ctx.stringValue("TrackResponse.DataList["+ i +"].ProgressList["+ j +"].DeliveryInfoList["+ k +"].AppGroupName"));

					deliveryInfoList.add(deliveryInfoListItem);
				}
				progressListItem.setDeliveryInfoList(deliveryInfoList);

				progressList.add(progressListItem);
			}
			dataListItem.setProgressList(progressList);

			dataList.add(dataListItem);
		}
		trackResponse.setDataList(dataList);
	 
	 	return trackResponse;
	}
}