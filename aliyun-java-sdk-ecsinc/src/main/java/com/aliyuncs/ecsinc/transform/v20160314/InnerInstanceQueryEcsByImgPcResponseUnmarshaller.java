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

package com.aliyuncs.ecsinc.transform.v20160314;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.ErrorCode;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Group;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Group.Tag;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Img;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Img.OsTypeModel;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Img.OsTypeModel.Kind;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Img.QuoteType;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.Img.Tag2;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.PublicIp;
import com.aliyuncs.ecsinc.model.v20160314.InnerInstanceQueryEcsByImgPcResponse.Item.StatusNote;
import com.aliyuncs.transform.UnmarshallerContext;


public class InnerInstanceQueryEcsByImgPcResponseUnmarshaller {

	public static InnerInstanceQueryEcsByImgPcResponse unmarshall(InnerInstanceQueryEcsByImgPcResponse innerInstanceQueryEcsByImgPcResponse, UnmarshallerContext context) {
		
		innerInstanceQueryEcsByImgPcResponse.setRequestId(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.RequestId"));
		innerInstanceQueryEcsByImgPcResponse.setCount(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.count"));
		innerInstanceQueryEcsByImgPcResponse.setPageNo(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.pageNo"));
		innerInstanceQueryEcsByImgPcResponse.setPageSize(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.pageSize"));

		ErrorCode errorCode = new ErrorCode();
		errorCode.setCode(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.errorCode.code"));
		errorCode.setMessage(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.errorCode.message"));
		errorCode.setIsSuccess(context.booleanValue("InnerInstanceQueryEcsByImgPcResponse.errorCode.isSuccess"));
		innerInstanceQueryEcsByImgPcResponse.setErrorCode(errorCode);

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("InnerInstanceQueryEcsByImgPcResponse.data.Length"); i++) {
			Item item = new Item();
			item.setIntensiveNet(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].intensiveNet"));
			item.setSafetyQuota(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].safetyQuota"));
			item.setZoneNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].zoneNo"));
			item.setInstanceName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].instanceName"));
			item.setVncPort(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].vncPort"));
			item.setSystemDeviceCategory(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].systemDeviceCategory"));
			item.setVncHost(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].vncHost"));
			item.setPlatform(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].platform"));
			item.setInternetRx(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].internetRx"));
			item.setVlanNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].vlanNo"));
			item.setStatus(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].status"));
			item.setHostname(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].hostname"));
			item.setRegionNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].regionNo"));
			item.setInternetTx(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].internetTx"));
			item.setNetworkValidation(context.booleanValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].networkValidation"));
			item.setIntensiveIo(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].intensiveIo"));
			item.setNcId(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].ncId"));
			item.setEcsName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].ecsName"));
			item.setBps(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].bps"));
			item.setVncPassword(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].vncPassword"));
			item.setMem(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].mem"));
			item.setCreationTime(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].creationTime"));
			item.setSecurityControl(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].securityControl"));
			item.setRackId(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].rackId"));
			item.setDisk(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].disk"));
			item.setInnerIp(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].innerIp"));
			item.setRealZoneNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].realZoneNo"));
			item.setSerialNumber(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].serialNumber"));
			item.setIntensiveCpu(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].intensiveCpu"));
			item.setImageProductCode(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].imageProductCode"));
			item.setIntranetRx(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].intranetRx"));
			item.setIzNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].izNo"));
			item.setCores(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].cores"));
			item.setIntranetTx(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].intranetTx"));

			PublicIp publicIp = new PublicIp();
			publicIp.setBindIp(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].publicIp.bindIp"));
			publicIp.setAssignNatIp(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].publicIp.assignNatIp"));
			publicIp.setAssignIp(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].publicIp.assignIp"));
			item.setPublicIp(publicIp);

			StatusNote statusNote = new StatusNote();
			statusNote.setNoteCode(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].statusNote.noteCode"));
			statusNote.setNoteInfo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].statusNote.noteInfo"));
			item.setStatusNote(statusNote);

			Img img = new Img();
			img.setName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.name"));
			img.setSrcImageId(context.longValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.srcImageId"));
			img.setImageId(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.imageId"));
			img.setGmtCreated(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.gmtCreated"));
			img.setId(context.longValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.id"));
			img.setBid(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.bid"));
			img.setRemark(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.remark"));
			img.setVisibility(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.visibility"));
			img.setSupportIoOptimizedInstance(context.booleanValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.supportIoOptimizedInstance"));
			img.setImportOSSObject(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.importOSSObject"));
			img.setGmtModified(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.gmtModified"));
			img.setProgress(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.progress"));
			img.setVersion(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.version"));
			img.setImageProductCode(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.imageProductCode"));
			img.setAliUid(context.longValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.aliUid"));
			img.setGmtRelease(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.gmtRelease"));
			img.setImageCategory(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.imageCategory"));
			img.setDisplayName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.displayName"));
			img.setOwner(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.owner"));
			img.setVirtBaseImageId(context.longValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.virtBaseImageId"));
			img.setStatus(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.status"));
			img.setImportOSSBucket(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.importOSSBucket"));
			img.setIsPublic(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.isPublic"));
			img.setRegionNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.regionNo"));
			img.setFormat(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.format"));
			img.setImageSize(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.imageSize"));
			img.setSnapshotNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.snapshotNo"));

			OsTypeModel osTypeModel = new OsTypeModel();
			osTypeModel.setPlatform(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.platform"));
			osTypeModel.setId(context.longValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.id"));
			osTypeModel.setOsBit(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.osBit"));
			osTypeModel.setMinCpu(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.minCpu"));
			osTypeModel.setMinMemory(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.minMemory"));
			osTypeModel.setMaxCpu(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.maxCpu"));
			osTypeModel.setMaxMemory(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.maxMemory"));
			osTypeModel.setOsName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.osName"));
			osTypeModel.setOsMemo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.osMemo"));
			osTypeModel.setType(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.type"));

			Kind kind = new Kind();
			kind.setKind(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.osTypeModel.kind.kind"));
			osTypeModel.setKind(kind);
			img.setOsTypeModel(osTypeModel);

			QuoteType quoteType = new QuoteType();
			quoteType.setQuoteType(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.quoteType.quoteType"));
			img.setQuoteType(quoteType);

			List<Tag2> tags1 = new ArrayList<Tag2>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.tags.Length"); j++) {
				Tag2 tag2 = new Tag2();
				tag2.setKey(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.tags["+ j +"].key"));
				tag2.setValue(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].img.tags["+ j +"].value"));

				tags1.add(tag2);
			}
			img.setTags1(tags1);
			item.setImg(img);

			List<Group> groups = new ArrayList<Group>();
			for (int j = 0; j < context.lengthValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups.Length"); j++) {
				Group group = new Group();
				group.setEcsCount(context.integerValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].ecsCount"));
				group.setGmtModified(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].gmtModified"));
				group.setGroupNo(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].groupNo"));
				group.setGmtCreated(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].gmtCreated"));
				group.setGroupName(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].groupName"));
				group.setGroupDesc(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].groupDesc"));
				group.setVpcInstanceId(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].vpcInstanceId"));

				List<Tag> tags = new ArrayList<Tag>();
				for (int k = 0; k < context.lengthValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].tags.Length"); k++) {
					Tag tag = new Tag();
					tag.setKey(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].tags["+ k +"].key"));
					tag.setValue(context.stringValue("InnerInstanceQueryEcsByImgPcResponse.data["+ i +"].groups["+ j +"].tags["+ k +"].value"));

					tags.add(tag);
				}
				group.setTags(tags);

				groups.add(group);
			}
			item.setGroups(groups);

			data.add(item);
		}
		innerInstanceQueryEcsByImgPcResponse.setData(data);
	 
	 	return innerInstanceQueryEcsByImgPcResponse;
	}
}