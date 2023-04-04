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

package com.aliyuncs.imm.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AddressesItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem.CroppingSuggestionsItem6;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem.CroppingSuggestionsItem6.Boundary7;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem.ImageScore3;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem.OCRContentsItem8;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioCoversItem.OCRContentsItem8.Boundary9;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.AudioStreamsItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestionsItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestionsItem.Boundary1;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.FiguresItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.FiguresItem.Boundary;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.FiguresItem.HeadPose;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.ImageScore;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.LabelsItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.OCRContentsItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.OCRContentsItem.Boundary2;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.SubtitlesItem;
import com.aliyuncs.imm.model.v20200930.GetFigureClusterResponse.FigureCluster.Cover.VideoStreamsItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFigureClusterResponseUnmarshaller {

	public static GetFigureClusterResponse unmarshall(GetFigureClusterResponse getFigureClusterResponse, UnmarshallerContext _ctx) {
		
		getFigureClusterResponse.setRequestId(_ctx.stringValue("GetFigureClusterResponse.RequestId"));

		FigureCluster figureCluster = new FigureCluster();
		figureCluster.setOwnerId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.OwnerId"));
		figureCluster.setProjectName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.ProjectName"));
		figureCluster.setDatasetName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.DatasetName"));
		figureCluster.setObjectType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.ObjectType"));
		figureCluster.setObjectId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.ObjectId"));
		figureCluster.setUpdateTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.UpdateTime"));
		figureCluster.setCreateTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.CreateTime"));
		figureCluster.setName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Name"));
		figureCluster.setGender(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Gender"));
		figureCluster.setFaceCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.FaceCount"));
		figureCluster.setImageCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.ImageCount"));
		figureCluster.setVideoCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.VideoCount"));
		figureCluster.setAverageAge(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.AverageAge"));
		figureCluster.setMinAge(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.MinAge"));
		figureCluster.setMaxAge(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.MaxAge"));
		figureCluster.setCustomId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.CustomId"));
		figureCluster.setCustomLabels(_ctx.mapValue("GetFigureClusterResponse.FigureCluster.CustomLabels"));
		figureCluster.setMetaLockVersion(_ctx.longValue("GetFigureClusterResponse.FigureCluster.MetaLockVersion"));

		Cover cover = new Cover();
		cover.setOwnerId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OwnerId"));
		cover.setProjectName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ProjectName"));
		cover.setDatasetName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.DatasetName"));
		cover.setObjectType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ObjectType"));
		cover.setObjectId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ObjectId"));
		cover.setUpdateTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.UpdateTime"));
		cover.setCreateTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.CreateTime"));
		cover.setURI(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.URI"));
		cover.setOSSURI(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSURI"));
		cover.setFilename(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Filename"));
		cover.setMediaType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.MediaType"));
		cover.setContentType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ContentType"));
		cover.setSize(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Size"));
		cover.setFileHash(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FileHash"));
		cover.setFileModifiedTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FileModifiedTime"));
		cover.setFileCreateTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FileCreateTime"));
		cover.setFileAccessTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FileAccessTime"));
		cover.setProduceTime(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ProduceTime"));
		cover.setLatLong(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.LatLong"));
		cover.setTimezone(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Timezone"));
		cover.setTravelClusterId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.TravelClusterId"));
		cover.setOrientation(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Orientation"));
		cover.setFigureCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.FigureCount"));
		cover.setTitle(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Title"));
		cover.setImageWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.ImageWidth"));
		cover.setImageHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.ImageHeight"));
		cover.setEXIF(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.EXIF"));
		cover.setVideoWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoWidth"));
		cover.setVideoHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoHeight"));
		cover.setArtist(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Artist"));
		cover.setAlbumArtist(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AlbumArtist"));
		cover.setComposer(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Composer"));
		cover.setPerformer(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Performer"));
		cover.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Language"));
		cover.setAlbum(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Album"));
		cover.setDocumentLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.DocumentLanguage"));
		cover.setPageCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.PageCount"));
		cover.setDocumentContent(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.DocumentContent"));
		cover.setETag(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ETag"));
		cover.setCacheControl(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.CacheControl"));
		cover.setContentDisposition(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ContentDisposition"));
		cover.setContentEncoding(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ContentEncoding"));
		cover.setContentLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ContentLanguage"));
		cover.setAccessControlAllowOrigin(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AccessControlAllowOrigin"));
		cover.setAccessControlRequestMethod(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AccessControlRequestMethod"));
		cover.setServerSideEncryptionCustomerAlgorithm(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ServerSideEncryptionCustomerAlgorithm"));
		cover.setServerSideEncryption(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ServerSideEncryption"));
		cover.setServerSideDataEncryption(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ServerSideDataEncryption"));
		cover.setServerSideEncryptionKeyId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ServerSideEncryptionKeyId"));
		cover.setOSSStorageClass(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSStorageClass"));
		cover.setOSSCRC64(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSCRC64"));
		cover.setObjectACL(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ObjectACL"));
		cover.setContentMd5(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.ContentMd5"));
		cover.setOSSUserMeta(_ctx.mapValue("GetFigureClusterResponse.FigureCluster.Cover.OSSUserMeta"));
		cover.setOSSTaggingCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.OSSTaggingCount"));
		cover.setOSSTagging(_ctx.mapValue("GetFigureClusterResponse.FigureCluster.Cover.OSSTagging"));
		cover.setOSSExpiration(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSExpiration"));
		cover.setOSSVersionId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSVersionId"));
		cover.setOSSDeleteMarker(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSDeleteMarker"));
		cover.setOSSObjectType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OSSObjectType"));
		cover.setCustomId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.CustomId"));
		cover.setCustomLabels(_ctx.mapValue("GetFigureClusterResponse.FigureCluster.Cover.CustomLabels"));
		cover.setStreamCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.StreamCount"));
		cover.setProgramCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.ProgramCount"));
		cover.setFormatName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FormatName"));
		cover.setFormatLongName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.FormatLongName"));
		cover.setStartTime(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.StartTime"));
		cover.setBitrate(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Bitrate"));
		cover.setDuration(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.Duration"));

		ImageScore imageScore = new ImageScore();
		imageScore.setOverallQualityScore(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.ImageScore.OverallQualityScore"));
		cover.setImageScore(imageScore);

		List<AddressesItem> addresses = new ArrayList<AddressesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses.Length"); i++) {
			AddressesItem addressesItem = new AddressesItem();
			addressesItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].Language"));
			addressesItem.setAddressLine(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].AddressLine"));
			addressesItem.setCountry(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].Country"));
			addressesItem.setProvince(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].Province"));
			addressesItem.setCity(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].City"));
			addressesItem.setDistrict(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].District"));
			addressesItem.setTownship(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Addresses["+ i +"].Township"));

			addresses.add(addressesItem);
		}
		cover.setAddresses(addresses);

		List<FiguresItem> figures = new ArrayList<FiguresItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.Figures.Length"); i++) {
			FiguresItem figuresItem = new FiguresItem();
			figuresItem.setFigureId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FigureId"));
			figuresItem.setFigureConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FigureConfidence"));
			figuresItem.setFigureClusterId(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FigureClusterId"));
			figuresItem.setFigureClusterConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FigureClusterConfidence"));
			figuresItem.setFigureType(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FigureType"));
			figuresItem.setAge(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Age"));
			figuresItem.setAgeSD(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].AgeSD"));
			figuresItem.setGender(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Gender"));
			figuresItem.setGenderConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].GenderConfidence"));
			figuresItem.setEmotion(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Emotion"));
			figuresItem.setEmotionConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].EmotionConfidence"));
			figuresItem.setFaceQuality(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].FaceQuality"));
			figuresItem.setMouth(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Mouth"));
			figuresItem.setMouthConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].MouthConfidence"));
			figuresItem.setBeard(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Beard"));
			figuresItem.setBeardConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].BeardConfidence"));
			figuresItem.setHat(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Hat"));
			figuresItem.setHatConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].HatConfidence"));
			figuresItem.setMask(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Mask"));
			figuresItem.setMaskConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].MaskConfidence"));
			figuresItem.setGlasses(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Glasses"));
			figuresItem.setGlassesConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].GlassesConfidence"));
			figuresItem.setSharpness(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Sharpness"));
			figuresItem.setAttractive(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Attractive"));

			Boundary boundary = new Boundary();
			boundary.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Boundary.Width"));
			boundary.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Boundary.Height"));
			boundary.setLeft(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Boundary.Left"));
			boundary.setTop(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].Boundary.Top"));
			figuresItem.setBoundary(boundary);

			HeadPose headPose = new HeadPose();
			headPose.setPitch(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].HeadPose.Pitch"));
			headPose.setRoll(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].HeadPose.Roll"));
			headPose.setYaw(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Figures["+ i +"].HeadPose.Yaw"));
			figuresItem.setHeadPose(headPose);

			figures.add(figuresItem);
		}
		cover.setFigures(figures);

		List<LabelsItem> labels = new ArrayList<LabelsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.Labels.Length"); i++) {
			LabelsItem labelsItem = new LabelsItem();
			labelsItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].Language"));
			labelsItem.setLabelName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].LabelName"));
			labelsItem.setLabelLevel(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].LabelLevel"));
			labelsItem.setLabelConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].LabelConfidence"));
			labelsItem.setParentLabelName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].ParentLabelName"));
			labelsItem.setCentricScore(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.Labels["+ i +"].CentricScore"));

			labels.add(labelsItem);
		}
		cover.setLabels(labels);

		List<CroppingSuggestionsItem> croppingSuggestions = new ArrayList<CroppingSuggestionsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions.Length"); i++) {
			CroppingSuggestionsItem croppingSuggestionsItem = new CroppingSuggestionsItem();
			croppingSuggestionsItem.setAspectRatio(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].AspectRatio"));
			croppingSuggestionsItem.setConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].Confidence"));

			Boundary1 boundary1 = new Boundary1();
			boundary1.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].Boundary.Width"));
			boundary1.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].Boundary.Height"));
			boundary1.setLeft(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].Boundary.Left"));
			boundary1.setTop(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.CroppingSuggestions["+ i +"].Boundary.Top"));
			croppingSuggestionsItem.setBoundary1(boundary1);

			croppingSuggestions.add(croppingSuggestionsItem);
		}
		cover.setCroppingSuggestions(croppingSuggestions);

		List<OCRContentsItem> oCRContents = new ArrayList<OCRContentsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents.Length"); i++) {
			OCRContentsItem oCRContentsItem = new OCRContentsItem();
			oCRContentsItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Language"));
			oCRContentsItem.setContents(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Contents"));
			oCRContentsItem.setConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Confidence"));

			Boundary2 boundary2 = new Boundary2();
			boundary2.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Boundary.Width"));
			boundary2.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Boundary.Height"));
			boundary2.setLeft(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Boundary.Left"));
			boundary2.setTop(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.OCRContents["+ i +"].Boundary.Top"));
			oCRContentsItem.setBoundary2(boundary2);

			oCRContents.add(oCRContentsItem);
		}
		cover.setOCRContents(oCRContents);

		List<VideoStreamsItem> videoStreams = new ArrayList<VideoStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams.Length"); i++) {
			VideoStreamsItem videoStreamsItem = new VideoStreamsItem();
			videoStreamsItem.setIndex(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Index"));
			videoStreamsItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Language"));
			videoStreamsItem.setCodecName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].CodecName"));
			videoStreamsItem.setCodecLongName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].CodecLongName"));
			videoStreamsItem.setProfile(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Profile"));
			videoStreamsItem.setCodecTimeBase(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].CodecTimeBase"));
			videoStreamsItem.setCodecTagString(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].CodecTagString"));
			videoStreamsItem.setCodecTag(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].CodecTag"));
			videoStreamsItem.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Width"));
			videoStreamsItem.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Height"));
			videoStreamsItem.setHasBFrames(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].HasBFrames"));
			videoStreamsItem.setSampleAspectRatio(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].SampleAspectRatio"));
			videoStreamsItem.setDisplayAspectRatio(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].DisplayAspectRatio"));
			videoStreamsItem.setPixelFormat(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].PixelFormat"));
			videoStreamsItem.setLevel(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Level"));
			videoStreamsItem.setFrameRate(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].FrameRate"));
			videoStreamsItem.setAverageFrameRate(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].AverageFrameRate"));
			videoStreamsItem.setTimeBase(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].TimeBase"));
			videoStreamsItem.setStartTime(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].StartTime"));
			videoStreamsItem.setDuration(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Duration"));
			videoStreamsItem.setBitrate(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Bitrate"));
			videoStreamsItem.setFrameCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].FrameCount"));
			videoStreamsItem.setRotate(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].Rotate"));
			videoStreamsItem.setBitDepth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].BitDepth"));
			videoStreamsItem.setColorSpace(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].ColorSpace"));
			videoStreamsItem.setColorRange(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].ColorRange"));
			videoStreamsItem.setColorTransfer(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].ColorTransfer"));
			videoStreamsItem.setColorPrimaries(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.VideoStreams["+ i +"].ColorPrimaries"));

			videoStreams.add(videoStreamsItem);
		}
		cover.setVideoStreams(videoStreams);

		List<SubtitlesItem> subtitles = new ArrayList<SubtitlesItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles.Length"); i++) {
			SubtitlesItem subtitlesItem = new SubtitlesItem();
			subtitlesItem.setIndex(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Index"));
			subtitlesItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Language"));
			subtitlesItem.setCodecName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].CodecName"));
			subtitlesItem.setCodecLongName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].CodecLongName"));
			subtitlesItem.setCodecTagString(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].CodecTagString"));
			subtitlesItem.setCodecTag(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].CodecTag"));
			subtitlesItem.setStartTime(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].StartTime"));
			subtitlesItem.setDuration(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Duration"));
			subtitlesItem.setBitrate(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Bitrate"));
			subtitlesItem.setContent(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Content"));
			subtitlesItem.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Width"));
			subtitlesItem.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.Subtitles["+ i +"].Height"));

			subtitles.add(subtitlesItem);
		}
		cover.setSubtitles(subtitles);

		List<AudioStreamsItem> audioStreams = new ArrayList<AudioStreamsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams.Length"); i++) {
			AudioStreamsItem audioStreamsItem = new AudioStreamsItem();
			audioStreamsItem.setIndex(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Index"));
			audioStreamsItem.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Language"));
			audioStreamsItem.setCodecName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].CodecName"));
			audioStreamsItem.setCodecLongName(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].CodecLongName"));
			audioStreamsItem.setCodecTimeBase(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].CodecTimeBase"));
			audioStreamsItem.setCodecTagString(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].CodecTagString"));
			audioStreamsItem.setCodecTag(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].CodecTag"));
			audioStreamsItem.setTimeBase(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].TimeBase"));
			audioStreamsItem.setStartTime(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].StartTime"));
			audioStreamsItem.setDuration(_ctx.doubleValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Duration"));
			audioStreamsItem.setBitrate(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Bitrate"));
			audioStreamsItem.setFrameCount(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].FrameCount"));
			audioStreamsItem.setLyric(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Lyric"));
			audioStreamsItem.setSampleFormat(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].SampleFormat"));
			audioStreamsItem.setSampleRate(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].SampleRate"));
			audioStreamsItem.setChannels(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].Channels"));
			audioStreamsItem.setChannelLayout(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioStreams["+ i +"].ChannelLayout"));

			audioStreams.add(audioStreamsItem);
		}
		cover.setAudioStreams(audioStreams);

		List<AudioCoversItem> audioCovers = new ArrayList<AudioCoversItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers.Length"); i++) {
			AudioCoversItem audioCoversItem = new AudioCoversItem();
			audioCoversItem.setImageWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].ImageWidth"));
			audioCoversItem.setImageHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].ImageHeight"));
			audioCoversItem.setEXIF(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].EXIF"));

			ImageScore3 imageScore3 = new ImageScore3();
			imageScore3.setOverallQualityScore(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].ImageScore.OverallQualityScore"));
			audioCoversItem.setImageScore3(imageScore3);

			List<CroppingSuggestionsItem6> croppingSuggestions4 = new ArrayList<CroppingSuggestionsItem6>();
			for (int j = 0; j < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions.Length"); j++) {
				CroppingSuggestionsItem6 croppingSuggestionsItem6 = new CroppingSuggestionsItem6();
				croppingSuggestionsItem6.setAspectRatio(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].AspectRatio"));
				croppingSuggestionsItem6.setConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Confidence"));

				Boundary7 boundary7 = new Boundary7();
				boundary7.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Width"));
				boundary7.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Height"));
				boundary7.setLeft(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Left"));
				boundary7.setTop(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].CroppingSuggestions["+ j +"].Boundary.Top"));
				croppingSuggestionsItem6.setBoundary7(boundary7);

				croppingSuggestions4.add(croppingSuggestionsItem6);
			}
			audioCoversItem.setCroppingSuggestions4(croppingSuggestions4);

			List<OCRContentsItem8> oCRContents5 = new ArrayList<OCRContentsItem8>();
			for (int j = 0; j < _ctx.lengthValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents.Length"); j++) {
				OCRContentsItem8 oCRContentsItem8 = new OCRContentsItem8();
				oCRContentsItem8.setLanguage(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Language"));
				oCRContentsItem8.setContents(_ctx.stringValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Contents"));
				oCRContentsItem8.setConfidence(_ctx.floatValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Confidence"));

				Boundary9 boundary9 = new Boundary9();
				boundary9.setWidth(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Width"));
				boundary9.setHeight(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Height"));
				boundary9.setLeft(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Left"));
				boundary9.setTop(_ctx.longValue("GetFigureClusterResponse.FigureCluster.Cover.AudioCovers["+ i +"].OCRContents["+ j +"].Boundary.Top"));
				oCRContentsItem8.setBoundary9(boundary9);

				oCRContents5.add(oCRContentsItem8);
			}
			audioCoversItem.setOCRContents5(oCRContents5);

			audioCovers.add(audioCoversItem);
		}
		cover.setAudioCovers(audioCovers);
		figureCluster.setCover(cover);
		getFigureClusterResponse.setFigureCluster(figureCluster);
	 
	 	return getFigureClusterResponse;
	}
}