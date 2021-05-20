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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableItemResponse;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableItemResponse.PersonTableItem;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableItemResponse.PersonTableItem.IdentificationListItem;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableItemResponse.PersonTableItem.ImageListItem;
import com.aliyuncs.vcs.model.v20200515.UpdateAiotPersonTableItemResponse.PersonTableItem.ImageListItem.FeatureInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateAiotPersonTableItemResponseUnmarshaller {

	public static UpdateAiotPersonTableItemResponse unmarshall(UpdateAiotPersonTableItemResponse updateAiotPersonTableItemResponse, UnmarshallerContext _ctx) {
		
		updateAiotPersonTableItemResponse.setRequestId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.RequestId"));
		updateAiotPersonTableItemResponse.setMessage(_ctx.stringValue("UpdateAiotPersonTableItemResponse.Message"));
		updateAiotPersonTableItemResponse.setCode(_ctx.stringValue("UpdateAiotPersonTableItemResponse.Code"));

		PersonTableItem personTableItem = new PersonTableItem();
		personTableItem.setPersonTableId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.PersonTableId"));
		personTableItem.setIdentificationNum(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.IdentificationNum"));
		personTableItem.setPersonName(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.PersonName"));
		personTableItem.setPersonId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.PersonId"));
		personTableItem.setRemarks(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.Remarks"));
		personTableItem.setImageNum(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageNum"));
		personTableItem.setLastChange(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.LastChange"));
		personTableItem.setPersonCode(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.PersonCode"));

		List<IdentificationListItem> identificationList = new ArrayList<IdentificationListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAiotPersonTableItemResponse.PersonTableItem.IdentificationList.Length"); i++) {
			IdentificationListItem identificationListItem = new IdentificationListItem();
			identificationListItem.setType(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.IdentificationList["+ i +"].Type"));
			identificationListItem.setNumber(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.IdentificationList["+ i +"].Number"));

			identificationList.add(identificationListItem);
		}
		personTableItem.setIdentificationList(identificationList);

		List<ImageListItem> imageList = new ArrayList<ImageListItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList.Length"); i++) {
			ImageListItem imageListItem = new ImageListItem();
			imageListItem.setType(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].Type"));
			imageListItem.setStoragePath(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].StoragePath"));
			imageListItem.setSize(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].Size"));
			imageListItem.setDeviceId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].DeviceId"));
			imageListItem.setImageId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].ImageId"));
			imageListItem.setEventSort(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].EventSort"));
			imageListItem.setData(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].Data"));
			imageListItem.setHeight(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].Height"));
			imageListItem.setShotTime(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].ShotTime"));
			imageListItem.setFileFormat(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FileFormat"));
			imageListItem.setWidth(_ctx.longValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].Width"));

			FeatureInfo featureInfo = new FeatureInfo();
			featureInfo.setAlgorithmType(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.AlgorithmType"));
			featureInfo.setObjectId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.ObjectId"));
			featureInfo.setImageId(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.ImageId"));
			featureInfo.setTabIed(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.TabIed"));
			featureInfo.setAlgorithmVersion(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.AlgorithmVersion"));
			featureInfo.setFeatureData(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.FeatureData"));
			featureInfo.setVendor(_ctx.stringValue("UpdateAiotPersonTableItemResponse.PersonTableItem.ImageList["+ i +"].FeatureInfo.Vendor"));
			imageListItem.setFeatureInfo(featureInfo);

			imageList.add(imageListItem);
		}
		personTableItem.setImageList(imageList);
		updateAiotPersonTableItemResponse.setPersonTableItem(personTableItem);
	 
	 	return updateAiotPersonTableItemResponse;
	}
}