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

import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse.PersonTableItems;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemListItem;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemListItem.IdentificationType;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemListItem.SubImageType;
import com.aliyuncs.vcs.model.v20200515.DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemListItem.SubImageType.FeatureInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAiotPersonTableItemsResponseUnmarshaller {

	public static DescribeAiotPersonTableItemsResponse unmarshall(DescribeAiotPersonTableItemsResponse describeAiotPersonTableItemsResponse, UnmarshallerContext _ctx) {
		
		describeAiotPersonTableItemsResponse.setRequestId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.RequestId"));
		describeAiotPersonTableItemsResponse.setMessage(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.Message"));
		describeAiotPersonTableItemsResponse.setCode(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.Code"));

		PersonTableItems personTableItems = new PersonTableItems();
		personTableItems.setTotalNum(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.TotalNum"));
		personTableItems.setPageSize(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PageSize"));
		personTableItems.setPageNum(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PageNum"));

		List<PersonTableItemListItem> personTableItemList = new ArrayList<PersonTableItemListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList.Length"); i++) {
			PersonTableItemListItem personTableItemListItem = new PersonTableItemListItem();
			personTableItemListItem.setPersonTableId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].PersonTableId"));
			personTableItemListItem.setIdentificationNum(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].IdentificationNum"));
			personTableItemListItem.setPersonName(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].PersonName"));
			personTableItemListItem.setPersonId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].PersonId"));
			personTableItemListItem.setRemarks(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].Remarks"));
			personTableItemListItem.setImageNum(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageNum"));
			personTableItemListItem.setLastChange(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].LastChange"));
			personTableItemListItem.setPersonCode(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].PersonCode"));

			List<IdentificationType> identificationList = new ArrayList<IdentificationType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].IdentificationList.Length"); j++) {
				IdentificationType identificationType = new IdentificationType();
				identificationType.setType(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].IdentificationList["+ j +"].Type"));
				identificationType.setNumber(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].IdentificationList["+ j +"].Number"));

				identificationList.add(identificationType);
			}
			personTableItemListItem.setIdentificationList(identificationList);

			List<SubImageType> imageList = new ArrayList<SubImageType>();
			for (int j = 0; j < _ctx.lengthValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList.Length"); j++) {
				SubImageType subImageType = new SubImageType();
				subImageType.setType(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].Type"));
				subImageType.setStoragePath(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].StoragePath"));
				subImageType.setSize(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].Size"));
				subImageType.setDeviceId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].DeviceId"));
				subImageType.setImageId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].ImageId"));
				subImageType.setEventSort(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].EventSort"));
				subImageType.setData(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].Data"));
				subImageType.setHeight(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].Height"));
				subImageType.setShotTime(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].ShotTime"));
				subImageType.setFileFormat(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FileFormat"));
				subImageType.setWidth(_ctx.longValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].Width"));

				FeatureInfo featureInfo = new FeatureInfo();
				featureInfo.setTableId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.TableId"));
				featureInfo.setAlgorithmType(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.AlgorithmType"));
				featureInfo.setObjectId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.ObjectId"));
				featureInfo.setImageId(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.ImageId"));
				featureInfo.setAlgorithmVersion(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.AlgorithmVersion"));
				featureInfo.setFeatureData(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.FeatureData"));
				featureInfo.setVendor(_ctx.stringValue("DescribeAiotPersonTableItemsResponse.PersonTableItems.PersonTableItemList["+ i +"].ImageList["+ j +"].FeatureInfo.Vendor"));
				subImageType.setFeatureInfo(featureInfo);

				imageList.add(subImageType);
			}
			personTableItemListItem.setImageList(imageList);

			personTableItemList.add(personTableItemListItem);
		}
		personTableItems.setPersonTableItemList(personTableItemList);
		describeAiotPersonTableItemsResponse.setPersonTableItems(personTableItems);
	 
	 	return describeAiotPersonTableItemsResponse;
	}
}